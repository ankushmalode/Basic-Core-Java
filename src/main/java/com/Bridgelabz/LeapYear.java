/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year in 4 digit:");
        int year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " is Leap Year");
                else
                    System.out.println(year + " is not Leap Year");
            } else
                System.out.println(year + " is Leap Year");
        } else
            System.out.println(year + " is not Leap Year");
    }
}