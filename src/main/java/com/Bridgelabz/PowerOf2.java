/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter number in between 1 to 30: ");
        int N = number.nextInt();
        if (0 < N && N < 31) {
            for (int i = 1; i <= N; i++) {
                int powerTable = (int) Math.pow(2, i);
                System.out.println("2^" + i + "=" + powerTable);
            }
        } else
            System.out.println("Your are entering wrong number.");
    }
}