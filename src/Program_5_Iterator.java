/*
Write a Java program to iterate through all elements in an array list using
Iterator.
 */

import java.util.ArrayList;

public class Program_5_Iterator {

    public static void main(String[] args) {
elements();
    }

    public static void elements(){

        ArrayList<String> list = new ArrayList();
        list.add("car");
        list.add("bike");
        list.add("bicycle");
        list.add("truck");
        list.add("moped");

        System.out.println("Total ArrayList elements are " +list.size());
        for (String Elements : list) {
            System.out.println(Elements);

        }

    }
}
