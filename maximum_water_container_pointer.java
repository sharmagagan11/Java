import java.util.ArrayList;
public class maximum_water_container_pointer {
    // Complexity O(n)
    public static int store_water(ArrayList<Integer> height){
        int max_water=0;
        int left =0;
        int right = height.size()-1;
        while(left<right){
            // Calculate Water Area
            int height_cal=Math.min(height.get(left) , height.get(right));
            int width = right  - left ;
            int area_curr_water = height_cal * width;
            max_water = Math.max(max_water , area_curr_water);


            // Update Pointer

            if(height.get(left) > height.get(right)){
                right--;
            }
            else{
                left++;
            }

        }
        return max_water; 
    }


    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(store_water(height));

    }

}

