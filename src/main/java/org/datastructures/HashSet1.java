package org.datastructures;
import java.util.HashSet;

/*
        - Removes duplicates automatically
        - Unordered (does not preserve insertion order)
         - Allows only one `null` value

        - HashSet uses a **hash function** to quickly store and find values.

    - When you add a value:
        1. The value is passed into a hash function → produces a hash code (an integer).
        2. That number is mapped to an index (bucket) in a table.
        3. The value is stored in that bucket.

    - When you check for a value (e.g., contains()):
        1. The same hash function is applied to get the hash code.
        2. That hash code maps to the same bucket.
        3. The bucket is checked for the value using `equals()`.

    - Time complexity:
        - Average case: O(1) → very fast, because we jump straight to the bucket.
        - Worst case: O(n) → happens only if **all values** fall into the same bucket (hash collisions).
*/



public class HashSet1 {

    public static void main(String[] args) {

        HashSet <String> hs = new HashSet <String>();

        hs.add("Ken");    //O(1)
        hs.add("Chan");
        hs.add("Wei");
        hs.add(null);
        hs.add(null);


        hs.remove("Wei");  // O(1)

        System.out.println(hs.contains("Ken"));   // O(1) hashset use hashing to find if an element exists

        System.out.println(hs);  //null , chan , ken


    }
}
