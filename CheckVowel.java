// File: CheckVowel.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This program defines a method isVowel() that checks if a character is a vowel and tests it with user input.
import java.util.Scanner;

public class CheckVowel {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to see if it is a vowel or not: ");
        char input = sc.next().charAt(0);

        if (isVowel(input)) {
            System.out.println(input + " is a vowel.");
        } else {
            System.out.println(input + " is not a vowel.");
        }
    }
}
