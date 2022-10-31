import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
public class Program_4_Collection {
    public static void main(String[] args) {
arraycolor();
    }

    public static void arraycolor(){

        ArrayList<String> color = new ArrayList();
        color.add("Pink");
        color.add("White");
        color.add("Black");
        color.add("Yellow");
        color.add("Grey");
        color.add("Brown");
        color.add("Blue");
        color.add("Green");
        color.add("Silver");
        color.add("Gold");

        System.out.println(color);

      //  for (String colorname : color) {
           // System.out.println(colorname);

        }
    }
