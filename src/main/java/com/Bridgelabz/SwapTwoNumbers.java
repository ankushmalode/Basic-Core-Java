/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int FirstNumber = number.nextInt();
        System.out.print("Enter second number: ");
        int SecondNumber = number.nextInt();

        System.out.println("Before swapping: " + FirstNumber + "," + SecondNumber);
//        Swapping ligic:
        int temp = FirstNumber;
        FirstNumber = SecondNumber;
        SecondNumber = temp;
        System.out.println("After swapping: " + FirstNumber + "," + SecondNumber);
    }
}