import java.util.*;
/*           
           left         right
             0    1   2   3
top ----> 0  11   12  13  14 
         1  21   22  23  24
         2  31   32  33  34
bottom--->3  41   42  43  44

6 parameter

top =0
bottom = arr.length-1
left=0
right = arr[top].length-1
count= 16 ((bottom+1)*(right+1))
direction
dir= 1 (left to right)
dir=2 (top+1 to bottom)
dir =3 (right-1 to left)
dir= 4 (bottom-1 to top-1)
*/

public class spiral_print {
    public static void main(String args[]) {
        int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
        SpiralPrintClockwise(arr);
    }

    public static void SpiralPrintClockwise(int[][] arr) {

        int top, bottom, left, right, count, dir;
        top = 0;
        bottom = arr.length - 1;
        left = 0;
        right = arr[top].length - 1;
        count = (bottom + 1) * (right + 1); // 16
        dir = 1;

        while (left <= right && top <= bottom ) {
            if (count > 0) {
                if (dir == 1) {
                    for (int i = left; left <= right; i++) {
                        System.out.print(arr[top][i] + " ,");
                        count--;
                    }
                    dir = 2;
                    top++;
                }
            }
            if (count > 0) {
                if (dir == 2) {
                    for (int i = top ; i <= bottom; i++) {
                        System.out.print(arr[i][right] + " ,");
                        count--;
                    }
                    dir = 3;
                    right--;
                }

            }
            if (count > 0) {
                if (dir == 3) {
                    for (int i = right; i >= left; i++) {
                        System.out.print(arr[bottom][i] + " ,");
                        count--;
                    }
                    dir = 4;
                    bottom--;
                }
            }
            if (count > 0) {
                if (dir == 4) {
                    for (int i = bottom; i >= top + 1; i++) {
                        System.out.print(arr[i][left] + " ,");
                        count--;
                    }
                }
                dir = 1;
                left++;
            }
        }
        System.out.println("end");
    }

}
