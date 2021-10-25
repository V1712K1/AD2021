package pt.uma.tpsi;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args){
        double resultPowerOf = NumericalUtilities.powerOf(3,3);
        System.out.println("O resultado é: " + resultPowerOf);

        int resultSumOfNaturalNumbersUpTo = NumericalUtilities.sumOfNaturalNumbersUpTo(10);
        System.out.println("O resultado é: " + resultSumOfNaturalNumbersUpTo);

        double resultSumOfNaturalNumbersBetween = NumericalUtilities.sumOfNaturalNumbersBetween(2,5);
        System.out.println("O resultado é: " + resultSumOfNaturalNumbersBetween);

        double sumOfEvenNumbersBetween = NumericalUtilities.sumOfEvenNumbersBetween(2,3);
        System.out.println("O resultado é: " + sumOfEvenNumbersBetween);

        int sumnumberOfDivisorsOf = NumericalUtilities.numberOfDivisorsOf(6);
        System.out.println("O resultado é: " + sumnumberOfDivisorsOf);

        boolean resultIsPrime = NumericalUtilities.isPrime(6);
        System.out.println("O resultado é: " + resultIsPrime);

        System.out.println();

        int[] array = {1,2,3,4};
        String resultIsString = ArrayUtilities.toString(array);
        System.out.println("O resultado é: " + resultIsString);

        int resultMaximumOf = ArrayUtilities.maximumOf(array);
        System.out.println("O resultado é: " + resultMaximumOf);

        int resultMinimumOf = ArrayUtilities.minimumOf(array);
        System.out.println("O resultado é: " + resultMinimumOf);

        String resultCopyOf = ArrayUtilities.toString(ArrayUtilities.copyOf(array));
        System.out.println("Elemento copiado: " + resultCopyOf);

        boolean resultContains = ArrayUtilities.contains(2, array);
        System.out.println("O resultado é: " + resultContains);

        int resultIndexOf = ArrayUtilities.indexOf(2,array);
        System.out.println("O resultado é: " + resultIndexOf);

        String resultAdd = ArrayUtilities.toString(ArrayUtilities.add(3,array));
        System.out.println("Elemento copiado: " + resultAdd);

        String resultRemove = ArrayUtilities.toString(ArrayUtilities.remove(3,array));
        System.out.println("Elemento copiado: " + resultRemove);
    }
}
