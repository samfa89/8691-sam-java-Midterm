package math_problems;

public class PrimeNumber {

    public static void main(String[] args) {
        int limit = 1_000_000;
        boolean[] primes = findPrimes(limit);

        System.out.println("Prime Numbers from 2 to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
    }

    /**
     * Finds all prime numbers within a given limit using the Sieve of Eratosthenes algorithm.
     *
     * @param limit The upper limit to find prime numbers.
     * @return A boolean array where primes[i] is true if i is a prime number.
     */
    private static boolean[] findPrimes(int limit) {
        boolean[] primes = new boolean[limit + 1];

        // Assume all numbers are prime initially
        for (int i = 2; i <= limit; i++) {
            primes[i] = true;
        }

        // Mark multiples of each prime as non-prime
        for (int p = 2; p * p <= limit; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    primes[i] = false;
                }
            }
        }

        return primes;
    }
}
