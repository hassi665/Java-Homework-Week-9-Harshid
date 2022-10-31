/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
 */

import java.util.ArrayList;
import java.util.List;

public class Program_6_Element {

    public static void main(String[] args) {
       actors();
    }

    public static void actors(){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("SRK");
        list_Strings.add("Sallu");
        list_Strings.add("Anil");
        list_Strings.add("Vinod");
        list_Strings.add("Akshay");

        System.out.println("Total String elements : " + list_Strings);

        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        element = list_Strings.get(3);
        System.out.println("Fourth element: "+element);
    }
}
