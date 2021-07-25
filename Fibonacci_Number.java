class Solution {
    public int fib(int n) {

        int a = 0, b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }

}

// package LEET CODE SQL CODES;

/**
 * Fibonacci_Number
 */
public class Fibonacci_Number {

    public static void main(String[] args) {

    }
}
