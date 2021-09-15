package com.bridgelabz;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        CouponNumber();
    }

    public static void CouponNumber() {
        String coupon = null;
        System.out.println("Enter number of coupons: ");
        int n = new Scanner(System.in).nextInt();
        char[] codeValues = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        System.out.println("Coupon code generated are:");
        for (int i = 0; i < n; i++) {
            int randomValue = (int) (Math.random() * 999999999);
            StringBuffer alpha = new StringBuffer();
            while (randomValue > 0) {
                alpha.append(codeValues[randomValue % codeValues.length]);
                randomValue = randomValue / alpha.length();
            }
            coupon = alpha.toString();
            System.out.println(coupon);

        }
    }
}
