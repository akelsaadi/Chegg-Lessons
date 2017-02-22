package q3;

import java.util.Scanner;

public class Plumbers {

    public static void main(String[] args) {

        double price = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Natural Floods & Burst Pipes?");
        System.out.println("1 - Natural Floods: ");
        System.out.println("2 - Burst Pipes: ");
        int option = s.nextInt();
        if (option == 1) {
            System.out.println("No of Room Costs?");
            int no = s.nextInt();
            if(no == 1){
                price += 300;
            }else if(no == 2){
                price += 500;
            }else if(no >= 3){
                price += 750;
            }
        }
        if (option == 2) {
            System.out.println("No of Pipes?");
            int no = s.nextInt();
            if(no == 1){
                price += 50;
            }else if(no == 2){
                price += 70;
            }else if(no >= 3){
                price += 100;
            }
        }
        System.out.println("Your bill = "+price);
    }

}
