// Java program to demonstrate
// adding elements to the HashTable

// Importing HashTable class
import java.util.Hashtable; 
import java.io.*;

class AddElementsToHashTable {
    public static void main(String args[]) {
        // Create a hash table
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        // Adding key-value pairs to the hash table
        hashtable.put("A", "Geeks");
        hashtable.put("B", "For");
        hashtable.put("C", "Geeks");

        // Print the hash table
        System.out.println("The hash table is: " + hashtable);
    }
}