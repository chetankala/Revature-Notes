public class recursions {
    public int factorial(int n) {
        // Recursion is a programming technique where a function calls itself in order to solve a problem.
        // A recursive function typically has a base case that stops the recursion and a recursive case that breaks the problem into smaller subproblems.

        // Example: Factorial of a number n (denoted as n!) is the product of all positive integers less than or equal to n.
        // The factorial can be defined recursively as:
        // factorial(n) = n * factorial(n - 1) for n > 0
        // factorial(0) = 1

        if (n == 1) return 1;
        else return factorial(n - 1) * n;
    }

    public int n_fibonacci(int n) {
        // The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
        // The Fibonacci sequence can be defined recursively as:
        // fib(n) = fib(n - 1) + fib(n - 2) for n > 1
        // fib(0) = 0
        // fib(1) = 1

        if (n == 1 || n == 2) return 1;
        else return n_fibonacci(n - 1) + n_fibonacci(n - 2); 
    }
}