package math_problems;

public class Fibonacci {

    public static void main(String[] args) {
        printFibonacciNumbers(40);
    }

    public static void printFibonacciNumbers(int count) {
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Numbers: ");

        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

