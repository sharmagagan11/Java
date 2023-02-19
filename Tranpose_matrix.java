import java.util.*;
public class Tranpose_matrix {
    public static void main(String args[]) {

        // Program to merge two array

        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many rows you want");
        int r = sc.nextInt();

        System.out.println("enter how many colums you want");
        int c = sc.nextInt();

        int[][] matA = new int[r][c];

        System.out.println("enter "+(r*c)+" values ");

        for(int i =0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                matA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix is : ");
        for(int i=0 ; i<r;i++){
            for(int j = 0 ; j< c ; j++){
                System.out.print(matA[i][j] + "\t");
            }
            System.out.println();
        } 

        System.out.println("Transpose of  Matrix is : ");
        for(int i=0 ; i<c;i++){
            for(int j = 0 ; j< r ; j++){
                System.out.print(matA[j][i] + "\t");
            }
            System.out.println();
        } 

    
    }
}
