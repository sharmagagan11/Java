/*
 *    input
 *    arr = { 1,1,2,2,3,3,2,4,4,5}
 *    output
 * arr = {1,2,3,4,5} and total no of unique number is == 5
 */



public class remove_duplicate_sorted_arr {

    public static void remove_duplicate(int [] arr){
        if(arr.length==0)
            return 0;
        
        int i = 1;
        for(int j=0 ; j<=arr.length ; j++){
            if(arr[i]!=arr[j]){
                i++;
            }
            if(arr[i]=arr[j]){
            }
        }
        return i+1 ;
}
    
}
