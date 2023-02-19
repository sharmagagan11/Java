import java.util.*;

public class segregate
{  
    public static void main(String args[]) {

        int[] array = { 0,1,0,1,0,0,1};    //traverse the array
        int i=0;
        for(int j=0;j<=array.length;j++){

           // if value at index equal to zero

            if(array[j]==0){
                array[i++]=array[j];    //[0,0,0,0]
            }
        }
        // after moved zero completely in array then we move into the array 1 upto the length of array
        while(i<array.length){
            array[i++]=1;
        }
        for(int k=0 ; k<=array.length;k++){
            System.out.println(array[k]+" ");
        }
       
    }
}

    
