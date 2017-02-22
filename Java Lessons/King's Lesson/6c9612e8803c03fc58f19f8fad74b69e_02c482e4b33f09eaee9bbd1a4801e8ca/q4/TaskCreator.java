package q4;

import java.util.Scanner;

public class TaskCreator {

    public static void main(String[] args) {

        char ch = 'y';
        Scanner s = new Scanner(System.in);
        Task t = null;
        while (ch == 'y' | ch == 'Y') {

            System.out.println("Enter ID: ");
            int id = s.nextInt();
            System.out.println("Enter Title: ");
            String title = s.nextLine();
            System.out.println("Enter Name: ");
            String name = s.nextLine();
            System.out.println("Enter Price: ");
            int price = s.nextInt();
            t = new Task(id, title, name, price);
            System.out.println("Want to Add More Tasks? ");
            ch = s.next().charAt(0);
        }
        
        System.out.println("Want to Display All Tasks? ");
        ch = s.next().charAt(0);
        if(ch == 'y' | ch == 'Y'){
            t.printAll();
        }
    }
}
