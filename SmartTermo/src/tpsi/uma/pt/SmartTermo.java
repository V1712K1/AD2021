package tpsi.uma.pt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class SmartTermo extends JFrame{
    private JPanel mainPanel;
    private JTextField textFieldTempAtual;
    private JTextField textFieldTempDesejada;
    private JButton buttonCF;
    private JButton acrescentaButton;
    private JButton diminuiButton;
    private JTextField textFieldData;
    private JTextField textFieldOnOff;
    private JTextArea textAreaLogEvents;

    private double actualTemp;
    private double desiredTemp;
    private int selectedFormat;
    private String messages;
    private Date data;
    private Timer timer;


    public SmartTermo(){
        super ("tpsi");
        this.setContentPane(mainPanel);
        this.pack();
        addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent e){
                System.exit(0);
            }
        });
        actualTemp = 20;
        desiredTemp = 20;
        selectedFormat = 0;
        messages = "";
        updateTextFields();


        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                 Random r = new Random();
                 if(actualTemp < desiredTemp && r.nextDouble() <= 0.8)
                     actualTemp += 0.5;
                 else if(r.nextDouble() > 0.7)
                     actualTemp -= 0.5;
                 updateTextFields();
            }
        };
        timer = new Timer("timer");
        timer.schedule(tt, 1000, 1000);

        acrescentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                // comportamento

                actualTemp += 0.5;
                desiredTemp += 0.5;
                updateTextFields();
                logEvents("Increased temperature");

            }
        });

        diminuiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                // comportamento

                actualTemp -= 0.5;
                desiredTemp -= 0.5;
                updateTextFields();
                logEvents("Decreased temperature");

            }
        });
        buttonCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                // comportamento

                if(selectedFormat == 0){
                    selectedFormat = 1;
                }
                else{
                    selectedFormat = 0;
                }
                updateTextFields();
                logEvents("Changed temperature");

            }
        });
    }

    public void updateTextFields(){
        if(selectedFormat == 0){
            textFieldTempDesejada.setText(String.format("%.1f", desiredTemp) + "C");
            textFieldTempAtual.setText(String.format("%.1f", actualTemp) + "C");
            buttonCF.setText("C");
        }
        else{
            textFieldTempDesejada.setText(String.format("%.1f", ((desiredTemp*9) / 5) + 32) + "F");
            textFieldTempAtual.setText(String.format("%.1f", ((actualTemp*9) / 5) + 32) + "f");
            buttonCF.setText("F");
        }
        SimpleDateFormat formatterMore = new SimpleDateFormat("dd/MM/yyyy ");
        data = new Date();
        textFieldData.setText(formatterMore.format(data));
        if(actualTemp < desiredTemp){
            textFieldOnOff.setText("On");
        }
        else{
            textFieldOnOff.setText("Off");
        }
    }

    public void logEvents (String info){
        SimpleDateFormat formatterMore = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        data = new Date();
        messages += formatterMore.format(data) + ": " + info+ "\n";
        textAreaLogEvents.setText(messages);
    }

    public static void main(String[] args) {
        JFrame smartTermo = new SmartTermo();
        smartTermo.setVisible(true);
    }
}
