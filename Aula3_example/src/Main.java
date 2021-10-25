public class Main {

    public static void main(String[] args) {

        final int[][] studentGrades = {

                {15, 18, 17},
                {18, 10, 11},
                {11, 13, 15},
                {10, 19, 16}

        };

        int sumOfGrades = 0;
        int numberOfGrades = 0;

        for (int student = 0; student < studentGrades.length; student++) {
            for (int course = 0; course < studentGrades[student].length; course++) {
                System.out.println("A nota e: " + studentGrades[student][course]);
                sumOfGrades += studentGrades[student][course];
                numberOfGrades++;
            }
        }
        int mediaGrades = sumOfGrades/numberOfGrades;
        System.out.println("A media das notas é: " + mediaGrades);

    }
}
