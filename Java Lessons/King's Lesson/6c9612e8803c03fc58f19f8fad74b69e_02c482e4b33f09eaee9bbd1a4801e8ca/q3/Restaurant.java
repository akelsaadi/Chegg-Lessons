package q3;

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {

        double price = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Salad or Sandwich? ");
        System.out.println("1 - Sandwich: ");
        System.out.println("2 - Salad: ");
        int option = s.nextInt();
        switch (option) {
            case 1:
                price +=7;
                System.out.println("Add Toppings Please? ");
                System.out.println("1 - lettuce: ");
                System.out.println("2 - tomatoes: ");
                System.out.println("3 - cheese: ");
                int top1 = s.nextInt();
                price+=1;
                break;
            case 2:
                System.out.println("Add Toppings Please? ");
                System.out.println("1 - tomatoes: ");
                System.out.println("2 - cheese: ");
                int top2 = s.nextInt();
                price+=0.50;
                break;
        }
        System.out.println("Your bill = "+price);
    }

}
