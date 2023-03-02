import java.util.ArrayList;
public class Arraylist_demo {

    public static void main(String args[]){
        // Java Collection Framework 
        // Similar to OOPS Syntax of Object Creation
        //ClassName Objectname = new ClassName();

        /*
        Array 
        1. Fixed Size
        2. Primitive data types can be stored 

        ArrayList
        1. Dynamic Size
        2. Primitive Data Type can not be Stored directly
        */

        ArrayList<Integer> list = new ArrayList<>(); 
        ArrayList<String> list2 = new ArrayList<>(); 
        ArrayList<Boolean> list3 = new ArrayList<>(); 

        // ADD Element   complexity in add in list is O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Get Operation   complexity in get in list is O(1)

        int element = list.get(2);
        System.out.println(element);

        // Remove Element (Delete)             complexity in add in list is O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element at Index                 complexity in add in list is O(n)
        list.set(1,10);
        System.out.println(list);

        // Contains Element                    complexity in add in list is O(n)

        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));

        list.add(1,9);   // add element on any index   complexity O(n)


        // Size of Array list

        System.out.println(list.size());

        // Print The ArrayList

        for(int i =0 ;i<list.size();i++){
            System.out.println(list.get(i) + " ");
        }




        }
    
}
