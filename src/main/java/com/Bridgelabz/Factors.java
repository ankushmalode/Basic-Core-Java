/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter Number to find the prime factors: ");
        int N = number.nextInt();
        System.out.print("The prime factors of number N is ");

        for (int i = 3; i <= Math.sqrt(N); i = i + 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            }
        }

        if (N > 2)
            System.out.print(N);
    }
}