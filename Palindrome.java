// File: Palindrome.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This program defines a method isPalindrome() to check if a non negative integer reads the same forward and backward.
import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;
        return num == reverseDigit(num);
    }

    private static int reverseDigit(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non negative integer: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
