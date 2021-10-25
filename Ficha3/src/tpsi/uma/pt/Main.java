package tpsi.uma.pt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        char resultLowerLetterSucessorOf = CharacterUtilities.lowerLetterSucessorOf('z');
        System.out.println("O resultado é: " + resultLowerLetterSucessorOf);

        char resultLowerLetterPredecessorOf = CharacterUtilities.lowerLetterPredecessorOf('z');
        System.out.println("O resultado é: " + resultLowerLetterPredecessorOf);

        char resultLowerLetterSucessorStepsOf = CharacterUtilities.lowerLetterSucessorStepsOf('k',19);
        System.out.println("O resultado é: " + resultLowerLetterSucessorStepsOf);

        char resultLowerLetterPredecessorStepsOf = CharacterUtilities.lowerLetterPredecessorStepsOf('k',19);
        System.out.println("O resultado é: " + resultLowerLetterPredecessorStepsOf);

        char[] array ={'a','b','a','c'};
        int resultoccurencesOfCharacterin = CharacterUtilities.occurencesOfCharacterin(array,'a');
        System.out.println("O resultado é: " + resultoccurencesOfCharacterin);

        char[] resultReplaceOfCharacterin = CharacterUtilities.replaceOfCharacterin(array,'a','f');
        System.out.println("O resultado é: " + Arrays.toString(resultReplaceOfCharacterin));

        char[] array1 = {'a','b','c'};
        char[] array2 = {'d', 'e'};
        char[] resultConcatenationOf = CharacterUtilities.concatenationOf(array1,array2);
        System.out.println("O resultado é: " + Arrays.toString(resultConcatenationOf));

        char[] array3 = {1,2,3,4,5,6,7,8};
        char[] resultCopyOfPartOf = CharacterUtilities.copyOfPartOf(array3,1,5);
        System.out.println("O resultado é: " + Arrays.toString(resultCopyOfPartOf));
    }
}
