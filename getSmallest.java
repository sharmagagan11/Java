import java.util.*;
// largest number in array 

public class getSmallest {
 
    public static int getSmallest(int numbers[]) {
        int Smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

           if (Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        return Smallest;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 3, 5 };

        System.out.println("Smallest value is : " + getSmallest(numbers));

    }
}

