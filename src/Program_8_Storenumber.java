/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program_8_Storenumber {

    public static void main(String[] args) {
        Program_8_Storenumber obj = new Program_8_Storenumber();
        obj.number();
    }

    public void number() {

        HashSet<Integer>num=new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);

        System.out.println("Set : " + num);

        HashSet<Integer> list = new HashSet();

        list.add(4);
        list.add(7);
        list.add(8);
        for ( int check: list ) {
            if(num.contains(check)) {
                System.out.println("checked Number : " + check + " belongs to this set -> " + num);
            }else {
                System.out.println("Number is not in the set ");
            
        }

        }
    }
}
