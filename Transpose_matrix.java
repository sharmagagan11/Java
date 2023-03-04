import java.util.*;

public class Transpose_matrix {
    public static void Traspose(int matrix[][] , int row ,int col){

        int [][] traspose = new int [col][row];
        for(int i=0 ;i<=row;i++){
            for(int j=0 ;j<=col;j++){

                transpose[j][i]=matrix[i][j];
            }
        }

        PrintMatrix( matrix);

        public static void PrintMatrix(int[][] matrix){
            for(int i=0 ;i<=matrix.length;i++){
                for(int j=0 ;j<=matrix[0].length;j++){
    
                System.out.println(matrix[i][j]," ");
                }
            }
            
        }




        

    }

    public static void main(String args[]) {
        int[][] matrix = { { 11, 12, 13 },
                { 21, 22, 23 } };

        int row = 2;
        int col = 3;

        Traspose(matrix, row, col);
        PrintMatrix(int[][] matrix);

    }

}
