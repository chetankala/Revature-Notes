public class Main {
    public static void main(String[] args) {
        // Methods are reusable blocks of code that perform a specific task.
        // They can take in parameters and return a value.

        // Method signature: <access modifier> <return type> <method name>(<parameters>)
        // Example: public int add(int a, int b)

        // To call a method, we use the method name followed by parentheses and any necessary arguments.
        // Example: int sum = add(5, 10);

        // Let's create a method for triangle formula

        /*
         * The formula for a triangle is: Area = (base * height) / 2
         * So let's define 2 variables for the needed values and do the calculation below
         */

        double area = calculateArea(3.5, 7.0);
        System.out.println("The area of the triangle 1 is: " + area);

        area = calculateArea(4.0, 10.0);
        System.out.println("The area of the triangle 2 is: " + area);

        area = calculateArea(12.0, 3.0);
        System.out.println("The area of the triangle 3 is: " + area);

        public static double calculateArea(double trianglebase, double triangleheight){
            double area = (trianglebase * triangleheight) / 2;
            area = area / 2;

            return area;
        }
    }
}

class Test {
    public static void main(String[] args) {
        hello("John", "Chris");
    }

    public static void hello(String name1, String name2){
        System.out.println("Hello " + name1 + " and " + name2 + "!");
    }
}