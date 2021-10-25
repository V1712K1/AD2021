package tpsi.uma.pt;

public class CharacterUtilities {

    public static char lowerLetterSucessorOf(char carac){
        if(carac == 'z') {
            carac = 'a';
            return carac;
        }
        else {
            int code = (int)carac;
            code++;
            return (char)code;
        }
    }

    public static char lowerLetterPredecessorOf(char carac){
        if(carac == 'a') {
            carac = 'z';
            return carac;
        }
        else {
            int code = (int)carac;
            code--;
            return (char)code;
        }
    }

    public static char lowerLetterSucessorStepsOf(char carac, int salto){
        int posicaoOriginal = carac - 'a';
        int novaPosicao = (posicaoOriginal + salto) % 26;

        return (char)('a' + novaPosicao);
    }

    public static char lowerLetterPredecessorStepsOf(char carac, int salto){
        int posicaoOriginal = carac - 'a';
        int novaPosicao = (posicaoOriginal - salto) % 26;

        if(novaPosicao < 0)
            novaPosicao += 26;

        return (char)('a' + novaPosicao);
    }

    public static int occurencesOfCharacterin(char[] asd, char letra){
        int contador = 0;
        for(int i = 0; i < asd.length; i++){
            if(letra == asd[i])
                contador++;
        }
        return contador;
    }

    public static char[] replaceOfCharacterin(char[] asd, char letraVerificar, char letraTrocar) {

        char[] newarray = new char[asd.length];
        for (int i = 0; i < asd.length; i++) {
            if (asd[i] == letraVerificar)
                newarray[i] = letraTrocar;
            else
                newarray[i] = asd[i];
        }
        return newarray;
    }
    public static char[] concatenationOf(char[] array1,char[] array2) {

        char[] newarray = new char[array1.length + array2.length];
        for(int i=0; i < array1.length; i++)
            newarray[i] += array1[i];

        for(int j=0; j< array2.length; j++)
            newarray[j + array1.length] += array2[j];

        return newarray;
    }

    public static char[] copyOfPartOf(char[] array ,int inicio , int fim) {
        if(fim < inicio )
            throw new IllegalArgumentException("O valor do fim nao pode ser menor ao inicio!!");

        char[] newarray = new char[(fim - inicio) + 1];
        for(int i=0; i < (fim - inicio) +1; i++)
            newarray[i] += array[i + inicio];

        return  newarray;
    }
}

