package q6;

import java.util.Scanner;

public class MyContacts {

    public static void main(String[] args) {

        int size = 0;
        Contact c = new Contact();
        Scanner s = new Scanner(System.in);
        while (true) {

            System.out.println("\nEnter An Option: ");
            System.out.println("1 - Add: ");
            System.out.println("2 - Remove: ");
            System.out.println("3 - Change Order: ");
            System.out.println("4 - Print: ");
            System.out.println("5 - Exit: ");
            int option = s.nextInt();
            if (option == 1) {
                System.out.println("Enter Name: ");
                c.name[size] = s.nextLine();
                System.out.println("Enter Number: ");
                c.number[size] = s.nextLine();
                System.out.println("Enter Address: ");
                c.address[size] = s.nextLine();
                size++;
                System.out.println("Contact is Added Succesfully!");
            } else if (option == 2) {
                if (size > 0) {
                    print(size - 1);
                    System.out.println("Enter an index to remove: ");
                    int index = s.nextInt();
                    c.name[index] = "";
                    c.number[index] = "";
                    c.address[index] = "";
                    System.out.println("Contact is Removed Succesfully!");
                }
            } else if (option == 3) {
                if (size > 0) {
                    print(size - 1);
                    System.out.println("Enter 1st Number: ");
                    int num1 = s.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    int num2 = s.nextInt();
                    swap(num1, num2);
                    System.out.println("Contact is Swapped Succesfully!");
                }
            } else if (option == 4) {
                if (size > 0) {
                    print(size - 1);
                }
            } else if (option == 5) {
                break;
            }
        }
    }

    public static void print(int size) {

        Contact c = new Contact();
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + " - Name: " + c.name[i] + ", Number: " + c.number[i] + ", Address: " + c.address[i]);
        }
    }

    public static void swap(int num1, int num2) {

        Contact c = new Contact();
        String temp = "";

        temp = c.name[num1];
        c.name[num1] = c.name[num2];
        c.name[num2] = temp;

        temp = c.number[num1];
        c.number[num1] = c.number[num2];
        c.number[num2] = temp;

        temp = c.address[num1];
        c.address[num1] = c.address[num2];
        c.address[num2] = temp;
    }
}
