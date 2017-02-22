package q10;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner kbd = new Scanner(System.in);
        int computerValue = randomNumber.nextInt(100);
        int numberOfTries = 0;
        int success = 0;
        int guess = 0;

        System.out.println("Welcome To Guessing Game!");

        while (true) {
            computerValue = randomNumber.nextInt(100);
            numberOfTries = 0;
            while (true) {
                System.out.println("Enter an integer between 1 and 1000: ");
                guess = kbd.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid input");
                } else if (guess == computerValue) {
                    System.out.println("Congratulations you won! Your numbers of tries was: " + numberOfTries + " and the number was: " + computerValue);
                    break;
                } else if (guess < computerValue) {
                    System.out.println("Your guess is too low!");
                } else if (guess > computerValue) {
                    System.out.println("Your guess is too high!");
                }
            }

            System.out.println("Do you want to play again? (1:Yes/2:No)");
            if (kbd.nextInt() != 1) {
                break;
            }
        }
    }
}
