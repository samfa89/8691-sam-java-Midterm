package math_problems;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;

        // Using recursion
        long factorialRecursive = calculateFactorialRecursive(number);
        System.out.println("Factorial of " + number + " (using recursion): " + factorialRecursive);

        // Using iteration
        long factorialIterative = calculateFactorialIterative(number);
        System.out.println("Factorial of " + number + " (using iteration): " + factorialIterative);
    }

    /**
     * Calculates the factorial of a number using recursion.
     *
     * @param number The number for which to calculate the factorial.
     * @return The factorial of the given number.
     */
    public static long calculateFactorialRecursive(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorialRecursive(number - 1);
        }
    }

    /**
     * Calculates the factorial of a number using iteration.
     *
     * @param number The number for which to calculate the factorial.
     * @return The factorial of the given number.
     */
    public static long calculateFactorialIterative(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}





