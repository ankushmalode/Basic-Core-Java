/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int FirstNumber = number.nextInt();
        System.out.print("Enter second number: ");
        int SecondNumber = number.nextInt();
        System.out.print("Enter Third number: ");
        int ThirdNumber = number.nextInt();

        if (FirstNumber>=SecondNumber && FirstNumber>=ThirdNumber)
            System.out.println(FirstNumber+" is largest number among three number.");
        else if(SecondNumber>ThirdNumber)
            System.out.println(SecondNumber+" is largest number among three number.");
        else
            System.out.println(ThirdNumber+" is largest number among three number.");
    }
}