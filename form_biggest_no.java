import java.util.Scanner;

import java.util.*;

public class form_biggest_no {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();

        while (tc > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
        }
        sort(arr[]);

        display(arr);
        tc--;

    }

    int val;

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + "");
        }
        System.out.println();
    }

    public static int[] takeInput() {
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = scan.nextInt();

        }
        return arr;
    }

   public static void sort(int[] arr){
    for(int i = 0 ; i <arr.length-1; i++){
        for(int j = 0 ; j<arr.length-1;j++){
            if(compare(arr[j] , arr[j+1] > 0)){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
   }

   public static int compare(int n1 , int n2){
    String val1 = n1+""+n2;
    String val2 = n2+""+n1;

    if(val1 int >val2 int){
        return-1;

    else
    return 1;

    }
}
}
