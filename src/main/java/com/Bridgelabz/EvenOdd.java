/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int Number = number.nextInt();
        if (Number % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
}