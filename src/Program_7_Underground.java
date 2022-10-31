/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */

import java.util.ArrayList;

public class Program_7_Underground {

    int a = 10;
    public static void main(String[] args) {
tube();
    }

    public static void tube(){
        ArrayList<String> list= new ArrayList<String>();
        list.add("Metro 1");
        list.add("Londonway");
        list.add("Southwest");
        list.add("Eastline");
        list.add("colonyconnect");
        System.out.println("Array list: " + list);
        System.out.println("Array list check empty or not  - "+list.isEmpty());
        list.removeAll(list);
        System.out.println("Array list can see after remove all elements "+list);
        System.out.println("Array list check empty or not  - "+list.isEmpty());
    }
}
