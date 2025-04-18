public class powerofxn {

    // Helper method that performs recursive exponentiation
    double solve(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            return solve(1 / x, -n);
        }

        if (n % 2 == 0) {
            return solve(x * x, n / 2);
        }

        return x * solve(x * x, (n - 1) / 2);
    }

    // Main method to be called from outside
    public double myPow(double x, int n) {
        return solve(x, (long) n); // Cast to long to handle edge cases like Integer.MIN_VALUE
    }

    // Entry point for running and testing the function
    public static void main(String[] args) {
        powerofxn pf = new powerofxn();

        // Sample test cases
//        System.out.println("2^5 = " + pf.myPow(2.0, 5));          // Output: 32.0
//        System.out.println("2^-3 = " + pf.myPow(2.0, -3));        // Output: 0.125
//        System.out.println("5^0 = " + pf.myPow(5.0, 0));          // Output: 1.0
        System.out.println("2^10 = " + pf.myPow(2.0, 6));        // Output: 1024.0
//        System.out.println("2^-2147483648 = " + pf.myPow(2.0, Integer.MIN_VALUE)); // Very small number
    }
}
