package q4;

import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {

        char ch = 'y';
        double price = 0;
        Scanner s = new Scanner(System.in);
        while(ch == 'y' | ch == 'Y'){
            
            System.out.println("Enter Coffee Type: ");
            System.out.println("1 - Coffee: ");
            System.out.println("2 - Espresso: ");
            System.out.println("3 - Tea: ");
            int option = s.nextInt();
            if(option == 1){
                price += 3.25;
                System.out.println("Enter Coffee SubType: ");
                System.out.println("1 - iced: ");
                System.out.println("2 - cream: ");
                System.out.println("3 - sugar: ");
                int choice = s.nextInt();
                if(choice == 2 | choice == 3){
                    price += 0.50;
                }
            }
            
            if(option == 2){
                price+= 4.25;
                System.out.println("Enter Espresso Choice: ");
                System.out.println("1 - caramel: ");
                System.out.println("2 - chocolate: ");
                System.out.println("3 - one shot: ");
                System.out.println("4 - two shots: ");
                int choice = s.nextInt();
                if(choice == 4){
                    price += 1.25;
                }
            }
            
            if(option == 3){
                price+= 2.75;
            }
            
            System.out.println("Want to Buy More: ");
            ch = s.next().charAt(0);
        }
        
        System.out.println("Your Total Amount = "+price);
    }
    
}
