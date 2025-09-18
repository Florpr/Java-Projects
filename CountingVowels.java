// File: CountingVowels.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This program prompts the user for a string and counts how many vowels it contains using the isVowel() method.
import java.util.Scanner;

public class CountingVowels {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sequence of letters to determine how many vowels are in the sequence: ");
        String input = sc.nextLine();

        int count = 0;
        for (char ch : input.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }

        System.out.println("Number of vowels in the sequence: " + count);
    }
}
