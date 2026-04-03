public class Student {
    private String name;

    // Constructor to initialize the name
    public Student(String name) {
        this.name = name;
    }

    // Method to get the length of the student's name
    public int getNameLength() {
        return name.length(); // Potenial NullPointerException if name is null
    }

    public static void main(String[] args) {
        // Creating a student with a null name
        Student student = new Student(null);

        try{
            // Simulating a situation where the student's name is null
            int nameLength = student.getNameLength(); // This will throw a NullPointerException
            System.out.println("Name length: " + nameLength); // This line will not be executed
        } catch (NullPointerException e) {
            System.out.println("Error: Name is null" + e.getMessage());
        }
    }
}