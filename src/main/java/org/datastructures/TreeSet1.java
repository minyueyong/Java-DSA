package org.datastructures;


import java.util.TreeSet;

/*
      - Red Black Tree
      - Ordering is by natural ordering  or can provide custom comparator
      - Does not allow null values
      - It does not use a hash table like HashSet & LinkedHashSet


         Time Complexities:
    ------------------------------
     Insert :                      O( log n )  -
     Delete at front / end:        O(log n)
     Insert at specific index:     O(log n)
     Delete by index:              O(log n)
     Delete by value:              O(log n)
     Search by value:              O(log n)
     Search by index:              O(log n)
     Sort:                         O(n)

       Space Complexities:
    ------------------------------

    Strong n elements             O(n)


 */
public class TreeSet1 {

    public static void main(String[] args) {

        TreeSet<String> hs = new TreeSet <String>();

        hs.add("Ken");    //O(1)
        hs.add("Chan");
        hs.add("Wei");
        hs.add("Chuan");



        hs.remove("Wei");  // O(1)

        //Natural ordering :  Chan , Chuan , Ken

        System.out.println(hs.contains("Ken"));   // O(1) hashset use hashing to find if an element exists
        System.out.println(hs.pollFirst());   //Chan
        System.out.println(hs.pollLast());    //Ken
        System.out.println(hs);  //Chan , Ken  - maintain natural sorted order
    }
}
