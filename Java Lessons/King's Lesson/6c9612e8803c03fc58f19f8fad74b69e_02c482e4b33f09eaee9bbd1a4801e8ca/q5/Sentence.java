package q5;

import java.util.Scanner;
import static q5.Palindrome.checkPalindrome;

public class Sentence {

    public static void main(String[] args) {

        String subject, verb, adverb;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter subject: ");
        subject = in.nextLine();
        System.out.println("Enter an Adverb: ");
        adverb = in.nextLine();
        System.out.println("Enter a verb: ");
        verb = in.nextLine();
        System.out.println("The completed sentence will be: "+subject+" "+verb+" "+adverb);
    }

}
