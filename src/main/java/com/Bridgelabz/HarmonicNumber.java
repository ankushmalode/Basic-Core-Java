/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int N = number.nextInt();
        float hormonicN = 0;

        for (int i = 1; i <= N; i++) {
            hormonicN = hormonicN + (float) 1 / i;
        }
        System.out.println("The N'th Harmonic Value is " + hormonicN);
    }
}