// Write a Java program to reverse an array of integer values

import java.util.ArrayList;
import java.util.Scanner;

public class Program_3_ReverseArrayInteger {
    public static void main(String[] args) {
        arrayrevrse();
    }

    public static void arrayrevrse() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5};
        for (int i = a.length - 1; i >= 0; i--) {
            list.add(a [i]);
        }
        System.out.println("Reverse Array integers - " + list);
    }
}


