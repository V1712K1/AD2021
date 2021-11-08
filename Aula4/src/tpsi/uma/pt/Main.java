package tpsi.uma.pt;

public class Main {
    public static void main(String[] args){
        int[][] matrix1 = {
                {1,0},
                {2,1}
        };
        int[][] matrix2 = {
                {1,0},
                {2,5}
        };

        //MatrixUtilities.show(matrix1);

        //boolean resultisMatrix = MatrixUtilities.isMatrix(matrix1);
        //System.out.println(resultisMatrix);

        //boolean resultisIdentity = MatrixUtilities.isIdentity(matrix2);
        //System.out.println(resultisIdentity);

        //MatrixUtilities.show(MatrixUtilities.multiplyBy(matrix1,5));

        //boolean resultareCompatibleForSum = MatrixUtilities.areCompatibleForSum(matrix1,matrix2);
        //System.out.println(resultareCompatibleForSum);

        //------------------------------------------------------------------------------------------

        CharacterDrawingUtilities.drawElement('a');
        CharacterDrawingUtilities.drawLine();
        CharacterDrawingUtilities.drawHorizontalSegmentWith('*',4);
        System.out.println(" ");
        System.out.println(" ");
        CharacterDrawingUtilities.drawFilledRectangleWith('*',4,5);

    }
}
