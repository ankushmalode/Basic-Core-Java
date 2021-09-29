/*
  @author Ankush
 * @version 16.0
 * since 2021-09-28
 */
package com.Bridgelabz;

import java.util.Scanner;

public class VowelCosonant {
    public static void main(String[] args){
        Scanner alphabet = new Scanner(System.in);
        System.out.print("Enter Alphabet to check whether it is Vowel or Cosonant: ");
        char alph=alphabet.next().charAt(0);

        if (alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u')
            System.out.println(alph+" is a Vowel.");
        else
            System.out.println(alph+" is a Consonant.");
    }
}
