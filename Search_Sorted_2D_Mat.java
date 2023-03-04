import java.util.*;
public class Search_Sorted_2D_Mat {

    //from Bottom point to top most point search


    public static boolean StaircaseSearch(int Matrix [][] ,int key ){
        int row =Matrix[3].length-1;
        int col = 0;

        while(col < Matrix.length && row >= 0){

            if(Matrix[row][col]==key){
                System.out.println("found key at (" + row + ","+col + ")");
                return true;

            }
            else if(key >Matrix[row][col]){
                col++;

            }
            else{
                row--;
            }

        } 
        System.out.println("Key Not Found");
        return false;

    }

    public static void main(String args[]) {
        int[][] Matrix ={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50},};

        int key =50;
        System.out.println();
        StaircaseSearch(Matrix, key);

    }
}


