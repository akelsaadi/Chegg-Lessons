package q5;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String original;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();
        boolean result = checkPalindrome(original);
        if (result) {
            System.out.println("Entered string is a palindrome.");
        } else {
            System.out.println("Entered string is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String original) {

        int length = original.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
