package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        PerfectNumber();
    }

    public static void PerfectNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int check = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i);
                check = check + i;
            }
        }
        if (check == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not A Perfect Number");
        }
    }
}
