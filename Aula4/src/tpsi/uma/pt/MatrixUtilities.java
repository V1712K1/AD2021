package tpsi.uma.pt;

public class MatrixUtilities {
    public static void show(int[][] matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0; j < matrix[i].length; j++){ //para passar para as colunas, pomos nome[primeira_correr][seg...etc].len
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public static boolean isMatrix(int[][] matrix) {
        int cols = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (cols != matrix[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentity(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0; j < matrix[i].length; j++) { //para passar para as colunas, pomos nome[primeira_correr][seg...etc].len
                if (i == j) {
                    if (matrix[i][j] != 1){
                        return false;
                    }
                }
                else if(matrix[i][j] != 0){
                        return false;
                    }

                }

        }
        return true;
    }

    public static int[][] multiplyBy(int[][]matrix,int num){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                matrix[i][j] = num;
            }
        }
        return matrix;
    }

    public static boolean areCompatibleForSum(int[][] matriz1, int[][] matriz2){
        if(matriz1.length != matriz2.length){
            return false;
        }else{
            for(int i=0; i< matriz1.length; i++){
                if(matriz1[i].length != matriz2[i].length)
                    return false;
            }
        }
        return true;
    }



}

