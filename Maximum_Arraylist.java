import java.util.*;

public class Maximum_Arraylist {

// Complexity O(n)

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(67);
        list.add(69);
        list.add(9);
        list.add(96);

        int max =Integer.MIN_VALUE;

        for(int i =0 ; i<list.size();i++){
           // if(max<list.get(i)){

              //  max=list.get(i);
              max =Math.max(max , list.get(i));
            
        }
        System.out.println("Maximum Element is : "+max);

    }

}
