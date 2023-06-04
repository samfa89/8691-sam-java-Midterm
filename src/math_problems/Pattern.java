package math_problems;

public class Pattern {

    public static void main(String[] args) {
        int number = 100;
        int decrement = 1;

        System.out.print(number + ", ");

        while (number > 40) {
            if (number >= 90) {
                decrement = 1;
            } else if (number >= 70) {
                decrement = 2;
            } else if (number >= 40) {
                decrement = 3;
            }

            number -= decrement;
            System.out.print(number + ", ");
        }
    }
}
