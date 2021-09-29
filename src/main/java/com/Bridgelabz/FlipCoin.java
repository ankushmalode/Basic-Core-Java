/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
        int Tail = 0, Head = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many times do you want to flip the coin- ");
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (Math.random() < 0.5)
                Tail++;
            else
                Head++;
        }
        int head = (100 * Head) / count;
        int tail = (100 * Tail) / count;
        System.out.println("Percentage of Head is " + head + " vs Tail is " + tail);
    }
}
