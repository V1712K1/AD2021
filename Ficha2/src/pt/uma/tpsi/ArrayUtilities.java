package pt.uma.tpsi;

public class ArrayUtilities {

    public static String toString(int[] nome) {

        String text = "";
        for(int i = 0; i < nome.length-1; i++)
            text += nome[i] + ", ";
        text += nome[nome.length-1];
        return text;
    }

    public static int maximumOf(int[] array) {

        int result = array[0];
        for(int i = 0; i < array.length; i++)
            if(array[i]> result)
                result = array[i];
        return result;
    }

    public static int minimumOf(int[] array) {

        int result = array[0];
        for(int i = 0; i < array.length; i++)
            if(array[i]< result)
                result = array[i];
        return result;
    }

    public static int[] copyOf(int[] array) {

        int size = array.length;
        int[] arraycopy = new int[size];
        for(int i = 0; i < array.length; i++)
            arraycopy[i] = array[i];
        return arraycopy;
    }

    public static boolean contains(int num, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == num)
                return true;
        }
        return false;
    }

    public static int indexOf(int num, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == num)
                return i;
        }
        return -1;
    }
    public static int[] add(int num, int[] array) {

        int[] arraycopy = new int[array.length+1];

        for(int i = 0; i < array.length; i++)
            arraycopy[i] = array[i];

        arraycopy[arraycopy.length-1] += num;
        return arraycopy;
    }

    public static int[] remove(int valueToDelete, int[] array) {

        int index = indexOf(valueToDelete, array);
        if(index == -1)
            return array;
        else {
            int[] arraycopy = new int[array.length-1];
            for (int i = 0; i < array.length; i++){
                if(i < index)
                    arraycopy[i] = array[i];
                else if (i > index)
                    arraycopy[i-1] = array[i];

            }
            return arraycopy;
        }
    }
}
