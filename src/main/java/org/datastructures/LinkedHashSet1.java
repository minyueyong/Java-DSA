package org.datastructures;

import java.util.LinkedHashSet;

/*

         - Removes duplicates automatically
         - Maintain insertion order - just like linkedList
         - Allows only one `null` value
         - HashTable + LinkedList
         - Space complexity is higher than HashSet because of the before and next pointer to maintain insertion order

 */
public class LinkedHashSet1 {

    public static void main(String[] args) {

        LinkedHashSet<String> hs = new LinkedHashSet <String>();

        hs.add("Ken");    //O(1)
        hs.add("Chan");
        hs.add("Wei");
        hs.add(null);
        hs.add(null);


        hs.remove("Wei");  // O(1)

        System.out.println(hs.contains("Ken"));   // O(1) hashset use hashing to find if an element exists

        System.out.println(hs);  //ken, chan , null  - maintain insertion order

    }
}
