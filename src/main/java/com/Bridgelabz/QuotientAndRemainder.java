/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        int quotient, remainder;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter DIVIDEND value: ");
        int dividend = number.nextInt();
        System.out.print("Enter DIVISOR value: ");
        int divisor = number.nextInt();

        System.out.println("The Quotient value is " + (quotient = dividend / divisor));
        System.out.println("The Remainder value is " + (remainder = dividend % divisor));
    }
}