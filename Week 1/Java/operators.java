public class operators {

}

package com.revature.main;

public class Driver {
    public static void main(String[] args){

        // There are 4 different types of operators in Java
        // 1. Arithmetic Operators (+, -, *, /, %)
        // 2. Assignment Operators (=, +=, -=, *=, /=, %=)
        // 3. Comparison Operators (==, !=, >, <, >=, <=)
        // 4. Logical Operators (&&, ||, !)

        // Tenerary Operator
        // <boolean expression> ? <expression if true> : <expression if false>
        int age = 20;
        String ageCategory = (age >= 18) ? "Adult" : "Minor";
        System.out.println(ageCategory);

        // Using logical operators, we can check if someone is at least 35 years old
        // and was born in the U.S.
        String born = "U.S.";
        if (age >= 35 && born == "U.S."){
            System.out.println("You are eligible to run for president.");
        } else {
            System.out.println("You are not eligible to run for president.");
        }

        // Using the || operator, we can verify someone's identity
        boolean hasPassword = true;
        boolean hasLicense = false;
        if (hasPassword || hasLicense){
            System.out.println("Identity confirmed.");
        } else {
            System.out.println("Identity not confirmed.");
        }
    }
}