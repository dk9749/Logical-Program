package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("The Number Is Not Prime");
        } else {
            System.out.println("The Number Is Prime");
        }
    }
}
