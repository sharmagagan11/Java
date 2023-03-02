
import java.util.ArrayList;

// Complexity O(n^2)

public class Maximum_water_container {

    public static int store_water(ArrayList<Integer> height) {
        int max_water = 0;
        // Brute Force Approach

        for (int i = 0; i <= height.size(); i++) {
            for (int j = i + 1; j <= height.size(); j++) {
                int height_cal = Math.min(height.get(i), height.get(j));
                int width_cal = j - i;
                int area_curr_water = height_cal * width_cal;
                max_water = Math.max(max_water, area_curr_water);

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
