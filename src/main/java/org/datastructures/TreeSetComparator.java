package org.datastructures;

import java.util.Comparator;
import java.util.TreeSet;

 class Employee{


     String name;
     int age;


     public Employee(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     @Override
     public String toString() {
         return name + " - " + age;
     }
 }

 class sortbyNameThenAge implements Comparator<Employee> {

     @Override
     public int compare(Employee o1, Employee o2) {


         // if name are same , order by age
         if ( o1.getName().equals(o2.getName())){
             return o1.getAge() - o2.getAge();
         }else {
             return o1.getName().compareTo(o2.getName());  //order name by ascending order
         }

     }
 }

public class TreeSetComparator {

    public static void main(String[] args) {


        TreeSet<Employee> hs = new TreeSet <Employee>( new sortbyNameThenAge ( ));
        hs.add(new Employee ( "Min Yue", 25));
        hs.add(new Employee ( "Min Yue", 27));
        hs.add(new Employee ( "Ken Chan", 40));

        for (Employee e : hs) {
            System.out.println(e.getName() + " - " + e.getAge());
        }

        /*
        Ken Chan - 40
        Min Yue - 25
        Min Yue - 27
         */


    }
}
