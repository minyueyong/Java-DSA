package org.datastructures;

import java.util.List;


/*

            Time Complexities:
    ------------------------------
    Insert at end (amortized):    O(1)  - insert until a certain capacity the array have to resize which will copy elements into
                                          a new array which is O(N)
    Insert at specific index:     O(n)
    Delete by index:              O(n)
    Delete by value:              O(n)
    Search by value:              O(n)
    Search by index:              O(1)
    Sort:                         O(n log n)

     Space Complexities:
    ------------------------------
    Insert at end (amortized):    O(1)
    Insert at front :             O(1)   need shift elements to the right
    Insert at specific index:     O(1)   need to shift elements to the right
    Delete by index:              O(1)   need to shift elements to the left
    Delete by value:              O(1)   need to shift elements to the left
    Search by value:              O(1)   need to check elements one by one until you reach that element
    Search by index:              O(1)

    for insert operation even when there is resizing , its still O(N) because we copy over to new array
    and delete the old array

 */

public class ArrayList {
    public static void main(String[] args) {

        List<Integer> intList = new java.util.ArrayList<Integer>();

        intList.add(1);   //Insert O(1)
        intList.add(2);
        intList.add(3);
        intList.add(4);


        //does not replace the element at that position , it will shift elements to the right
        intList.add(1,5);   // Insert at a specific place O ( n )

        System.out.println ( intList.toString());

        System.out.println(intList.contains(5));   // Search By Value is O(n) because have to loop the list

        System.out.println(intList.get(0));   //Search By Index is O(1)

        System.out.println(intList.remove(1));  // Remove by Index is O(n) because required to shift element to the left

        System.out.println(intList.toString());

        System.out.println(intList.remove(Integer.valueOf(2))); //Remove by Value is O(N)

        System.out.println(intList.toString());




    }
}