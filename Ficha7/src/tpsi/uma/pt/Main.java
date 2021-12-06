package tpsi.uma.pt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2.b -> imprimir o menu enum
        for (Menu menu: Menu.values()){
            System.out.println(menu);
        }
        System.out.println();


        // 2.c -> selecionar do menu e mostrar mensagem apropriada com IF-ELSE
        for (Menu menu: Menu.values()){
            if(menu.name() == "SAVEGAME")
                System.out.println("Gravou o jogo");
            else if(menu.name() == "LOADGAME")
                System.out.println("Carregou o jogo");
            else if(menu.name() == "HIGHSCORES")
                System.out.println("Melhores pontuações do jogo");
            else if(menu.name() == "QUIT")
                System.out.println("Saindo do jogo...");
        }

        System.out.println();


        // 2.c -> selecionar do menu e mostrar mensagem apropriada com SWITCH

        for (Menu menu: Menu.values()){
            switch (menu.name()){
                case "SAVEGAME":
                    System.out.println("Gravou o jogo");
                    break;
                case "LOADGAME":
                    System.out.println("Carregou o jogo");
                    break;
                case "HIGHSCORES":
                    System.out.println("Melhores pontuações");
                    break;
                case "QUIT":
                    System.out.println("Saindo do jogo...");
                    break;
                default:
                    System.out.println("Opção não reconhecida!");
            }
        }

        System.out.println();


        List<Rational> listaRations = new ArrayList<>();
        listaRations.add(new Rational(1,2));
        listaRations.add(new Rational(1,5));
        listaRations.add(new Rational(3,2));
        listaRations.add(new Rational(4,3));
        System.out.println("Lista nao ordenada");
        for (Rational asd : listaRations)
            System.out.println(asd.toString());

        System.out.println("Lista ordenada");
        Collections.sort(listaRations);
        for (Rational asd : listaRations)
            System.out.println(asd.toString());


        System.out.println();
        System.out.println();

        List<Student> listaStudents = new ArrayList<>();
        listaStudents.add(new Student(12,"Jose"));
        listaStudents.add(new Student(13,"Andre"));
        listaStudents.add(new Student(34,"Gorete"));
        listaStudents.add(new Student(41,"Andreia"));
        System.out.println("Lista nao ordenada");
        for (Student asd : listaStudents)
            System.out.println(asd.toString());

        System.out.println("Lista ordenada");
        Collections.sort(listaStudents);
        for (Student asd : listaStudents)
            System.out.println(asd.toString());

        System.out.println();

        Collections.sort(listaStudents, new StudentsComparatorByName());
        for (Student asd : listaStudents)
            System.out.println(asd.toString());

        Map<Integer, Student> alunosMap = new HashMap<>();
        alunosMap.put(1, new Student(24,"Antonio"));
        alunosMap.put(1, new Student(25,"Manuel"));
        alunosMap.put(1, new Student(26,"David"));

        String nomeAProcurar = "Antonio";
        for (Student student: alunosMap.values()){
            if(student.getName().equals(nomeAProcurar)){
                System.out.println("NOICE!");
            }
        }

    }
}
