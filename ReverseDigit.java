// File: SquareRoot.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This program asks for a input of an integer and outputs the whole number revered.
import java.util.Scanner;

public class ReverseDigit{
    public static int reverseDigit(int num){
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
        }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a whole number to be able to return it reversed: ");
        int num = sc.nextInt();

        System.out.println(" Reversed the numbers given: " + reverseDigit(num));
    }
}

