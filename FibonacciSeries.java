package com.bridgelabz;

public class FibonacciSeries {

    public static void main(String[] args) {

        int a = 0, b = 1;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Fibonacci Series: " + a);
            sum = (a + b) * b;
            a = b;
            b = sum;
        }
    }
}
