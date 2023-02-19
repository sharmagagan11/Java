import java.util.*; 
// Print Sub arrays


public class Print_Sab_Arr {

    public static void sab_Arr(int numbers[]) {
        int total_subarray=0;
        for(int i= 0 ; i <numbers.length ; i++){
            int start =i;
            for(int j= i ;j< numbers.length ; j++){
                int end = j;
                for(int k= start ; k<=end ; k++){   // print 
                   System.out.print(numbers[k]+" ");  // subarray
                    total_subarray++;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("total sub  array is : " + total_subarray);
        
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        
    }
    
}
