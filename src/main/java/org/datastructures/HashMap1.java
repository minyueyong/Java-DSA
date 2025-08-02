package org.datastructures;

import java.util.HashMap;


/*
        Only 1 null key allows
        Use hashing and bucket
        O(N) if hash collision occur
        Unordered
        Once given a key , it will compute hashcode of the key then bucket index go to the specific bucket
        Keys must be unique

        Each bucket stores:
        - the key

        - the value

        - the hash code

        - and a pointer to the next entry (for handling collisions)

            Time Complexities:
    ------------------------------
     Insert :                      O(1)
                                   O(n)  - worse case is hash collision and hash to the same bucket
     Delete by key  :              O(1)
                                   O(n)  - worse

     Delete by value:              O(n)
     Search by key  :              O(1)    - compute hashcode then bucket index, then point to correct bucket
                                   O(n) - worse
     Search by value:              O(n)
     Sort:                         O(n log n)

       Space Complexities:
    ------------------------------

    Strong n elements             O(n)


 */

public class HashMap1 {

    public static void main(String[] args) {

        HashMap<String , Integer> hs = new HashMap<>();

        hs.put(null , 1);     //O(1)
        hs.put(null , 2);
        hs.put("Ken" , 3);
        hs.put("Chan" , 4);
        hs.put("Chuan",5);

        hs.containsKey("Ken");   //O(1)  - Once compute the hashcode then compute bucket index
                                  // then can point to the correct bucket

        hs.containsValue(3);     //O(n)  - must iterate over all values

        hs.get("Ken");           //O(1) - calculate the hashcode then straight away can locate the bucket

        hs.remove("Ken");    //O(1)

        hs.forEach((key , value ) -> {
            System.out.println(key + "  " + value);   //O(n)
        });
    }
}
