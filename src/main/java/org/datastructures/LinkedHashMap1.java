package org.datastructures;

import java.util.LinkedHashMap;

/*
     Maintain insertion order


     Each entry in LinkedHashMap has:

        key

        value

        hash

        next (for collision resolution — this is from HashMap)

        before and after (for insertion/access order — this is extra)


            Space Complexities:
    ------------------------------

    Strong n elements             O(n)
    Doubly-linkedlist-overhead    O(n)

 */
public class LinkedHashMap1 {

    public static void main(String[] args) {
        LinkedHashMap<String , Integer> hs = new LinkedHashMap<>();

        hs.put(null , 1);     //O(1)
        hs.put(null , 2);
        hs.put("Ken" , 3);
        hs.put("Chan" , 4);
        hs.put("Chuan",5);
        hs.put("Fight",5);

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
