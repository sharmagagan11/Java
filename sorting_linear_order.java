public class sorting_linear_order {

    // complexity O(N)

    public static void sort_linear_order(int numbers[]){
       int low = 0 ;
       int high = numbers.length ; 
       int mid =0 ;
       int temp = 0;
       while(mid<=high){
        if(numbers[mid]== 2){
            temp = numbers[mid];
            numbers[mid]=numbers[high];
            numbers[high]= temp ; 
            high--;
        }
        if(numbers[mid]==0){
            temp = numbers[mid];
            numbers[mid]=numbers[low];
            numbers[low]= temp ; 
            low++;
            mid++;
        }
        if(numbers[mid]==1){
            mid++;
        }
       }


        }

    public static void main(String args[]) {
        int numbers[] = { 0, 1, 2, 1, 2 };

    }

}
