package Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the user input
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        // close the scanner
        sc.close();

        // check the number is palindrome or not
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    // Method to check the number is palindrome or not
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}