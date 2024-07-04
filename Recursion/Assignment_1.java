class Tester {
    // Correct recursive method to find the nth Fibonacci number
    public static int findFibonacci(int n) {
        if (n == 0 || n == 1) return 0;
        else if (n == 2) return 1;
        else return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to test different cases
        if (n < 0) {
            System.out.println("Please enter a non-negative value for n");
        } else {
            System.out.println("The " + n + "th Fibonacci number is: " + findFibonacci(n));
        }
    }
}
