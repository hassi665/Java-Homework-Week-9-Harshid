/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Program_9_Map {
    public static void main(String[] args) {
        hashMap();

    }

    public static void hashMap() {


        HashMap< String, Integer> people = new HashMap();
        people.put("Hiren", 1);
        people.put("Harshid", 2);
        people.put("Nauman", 3);
        people.put("Siddhi", 4);
        people.put("Manisha", 5);
        people.put("Kishan", 6);
        people.put("Krupa", 7);

        for (Map.Entry<String, Integer> person : people.entrySet()) {
            System.out.println(person);

        }
    }
}
