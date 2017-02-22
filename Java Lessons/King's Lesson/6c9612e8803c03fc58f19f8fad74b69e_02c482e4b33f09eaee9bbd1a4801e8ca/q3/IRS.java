package q3;

import java.util.Scanner;

public class IRS {

    public static void main(String[] args) {

        int price = 0;
        int array[] = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.println("How many requirements you have? ");
        int ans = in.nextInt();
        if (ans <= 3) {

            for (int i = 0; i < ans; i++) {

                System.out.println("Enter Audit requirement: ");
                System.out.println("1 - W-2: ");
                System.out.println("2 - Receipts for donations: ");
                System.out.println("3 - Deduct more than 3 children: ");
                array[i] = in.nextInt();
            }

            for (int i = 0 ; i < ans; i++) {

                if (array[i] != 1) {
                    price += 500;
                }
                if (array[i] != 2) {
                    price += 300;
                }
                if (array[i] == 3) {
                    price += 1000;
                }
            }

        } else {
            System.out.println("Requirements should be less than 3!");
        }

        System.out.println("Price = " + price);

        if (price > 0) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
    }
}
