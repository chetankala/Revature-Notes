// Java program to illustrate HashMap class in java.util
// package

// Importing HashMap class
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // Creating an empty HashMap by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        // using the put() method
        map.put("Vishal", 10);
        map.put("Sachin", 30);
        map.put("Vaibhav", 20);

        // Print size and content of the HashMap
        System.out.println("Size of the HashMap: " + map.size());

        // Printing elements in object of HashMap
        System.out.println("Content of the HashMap: " + map);

        /* Checking if a key is present and if
         * present, print value by passing
         * random element
        */
        if (map.containsKey("Vishal")) {

            // Mapping 
            Integer a = map.get("Vishal");

            // Printing value for the corresponding key
            System.out.println("value for key \"Vishal\" is: " + a);
        }
    }
}