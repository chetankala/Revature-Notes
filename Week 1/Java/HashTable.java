// Java program to demonstrate
// adding elements to the HashTable

// Importing HashTable class
import java.util.Hashtable; 
import java.io.*;

class AddElementsToHashTable {
    public static void main(String args[]) {
        // Create a hash table
        Hashtable<String, String> ht1 = new Hashtable<>();

        // Initializing a hash table with generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

        // Adding key-value pairs to the hash table using the put() method
        ht1.put(1, "Alpha");
        ht1.put(2, "Beta");
        ht1.put(3, "Gamma");

        // Adding key-value pairs to the second hash table
        ht2.put(1, "Alpha");
        ht2.put(2, "Beta");
        ht2.put(3, "Gamma");

        // Print the hash tables
        System.out.println("Mapping of ht1 hash table is: " + ht1);
        System.out.println("Mapping of ht2 hash table is: " + ht2);
    }
}