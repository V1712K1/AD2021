package tpsi.uma.pt;

public class CharacterDrawingUtilities {

    public static void drawElement(char asd){
        System.out.print(asd);
    }

    public static void drawLine(){
        System.out.println("");
    }

    public static void drawHorizontalSegmentWith(char asd, int vezes){
        for(int i=0;i<=vezes;i++){
            drawElement(asd);
            drawElement(' ');
        }
    }

    public static void drawFilledRectangleWith(char caractere, int alt, int larg){
        for(int i=0; i <alt; i++){
            drawHorizontalSegmentWith(caractere,larg);
            drawLine();
        }
    }
}
