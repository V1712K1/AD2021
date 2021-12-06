package tpsi.uma.pt;

import java.util.Objects;

// 3. -> criar class Rational

// 3.c -> Comparable<Rational>
public class Rational implements Comparable<Rational>{

    // 3.a -> implementar atributos
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object asd){
        // comparação com return true por defeito(verificação por identidade)
        if(this == asd) return true;

        // comparação com return false por defeito(verifica se e null e se a classe e diferente)
        if (asd == null || this.getClass() !=asd.getClass()) return false;

        Rational asdComCastingParaRational = (Rational) asd;

        return numerator == asdComCastingParaRational.numerator &&
               denominator == asdComCastingParaRational.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }


    @Override
    public int compareTo(Rational asd) {
        return (this.numerator + asd.numerator)-(this.denominator + asd.denominator);
    }


    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
