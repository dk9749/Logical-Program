package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reversed number is: " + reverse);
    }
}