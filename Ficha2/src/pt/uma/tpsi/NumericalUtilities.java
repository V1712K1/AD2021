package pt.uma.tpsi;

public class NumericalUtilities {

    public static double powerOf(double valorBase, double valorExpoente) {

        if(valorExpoente < 0)
            return -1;

        double result = 1.0;
        for (int i = 0; i < valorExpoente; i++ )
            result *= valorBase;

        return result;
    }

    public static int sumOfNaturalNumbersUpTo(int valorDefinido) {

        int result = 0;
        for(int i = 1; i <= valorDefinido; i++)
            result += i;
        return result;
    }

    public static double sumOfNaturalNumbersBetween(double primeiroValor, double segundoValor) {

        if(primeiroValor == segundoValor)
            return -1;
        else if(primeiroValor > segundoValor)
            return -1;

        double result = 0;
        for(double i = primeiroValor ; i>=primeiroValor && i<=segundoValor;i++)
            result += i;
        return result;
    }

    public static double sumOfEvenNumbersBetween(double primeiroValor, double segundoValor) {

        if(primeiroValor == segundoValor)
            return -1;
        else if(primeiroValor > segundoValor)
            return -1;

        double result = 0;
        for(double i = primeiroValor ; i>=primeiroValor && i<=segundoValor;i++) {
            if(i%2 == 0)
                result += i;
        }
        return result;
    }

    public static int numberOfDivisorsOf(int valor) {

        if(valor < 0)
            return -1;

        int result = 0;
        for(int i = 1 ; i<=valor ; i++) {
            if(valor%i == 0)
                result++;
        }
        return result;
    }

    public static boolean isPrime(int valor) {
        return numberOfDivisorsOf(valor) == 2;

    }



}
