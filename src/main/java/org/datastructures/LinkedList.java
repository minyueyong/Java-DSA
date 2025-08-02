package org.datastructures;

/*

LinkedList can act as a queue , stack and deque
Java LinkedList is doubly by default

Queue : FIFO
Stack : LIFO
Deque : Double Ended Queue

            Time Complexities:
    ------------------------------
    Insert at front / end :       O(1)  -
    Delete at front / end:        O(1)
    Insert at specific index:     O(n)    - need traverse the linkedlist
    Delete by index:              O(n)     - need traverse the linkedlist
    Delete by value:              O(n)     - need traverse the linkedlist
    Search by value:              O(n)     - need traverse the linkedlist
    Search by index:              O(n)     - need traverse the linkedlist
    Sort:                         O(n log n)

     Space Complexities:
    ------------------------------
    Overall space for n elements: O(n) — each node stores data + 2 pointers (prev, next)
    Per operation:                O(1) — most operations use existing space , didn't create new space



 */

public class LinkedList {
    public static void main(String[] args) {


        java.util.LinkedList< Integer > intList = new java.util.LinkedList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(2);   //O(1) add at back

        intList.add(2,10);    // O(n) need to traverse the list to add at that location
        System.out.println(intList.get(1));    // O(n)
        System.out.println(intList.contains(2));  //O(N)

        //Queue Operation
        intList.addFirst(1);  //O(1)
        intList.addLast(6);   //O(1)

        //Stack Operation
        intList.push(2);   //O(1)   - add to front
        System.out.println(intList.pop());   //0(1) - remove from front
        System.out.println(intList.peek());   //O(1)  - look in front
        System.out.println(intList.peekFirst());  //O(1) - look in front
        System.out.println(intList.peekLast());   //O(1)  - look from behind

        //Deque Operation
        intList.addFirst(1);     //O(1)   - add to front
        intList.addLast(8);     //O(1)   - add to last
        intList.removeFirst();    //0(1) - remove from front
        intList.removeLast();    //0(1) - remove from back

    }



}
