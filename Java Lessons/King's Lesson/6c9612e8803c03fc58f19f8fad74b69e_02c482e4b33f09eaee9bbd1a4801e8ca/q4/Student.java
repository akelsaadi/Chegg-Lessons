package q4;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int option = 1;
        StudentFileReader st = null;
        while (option != 3) {

            System.out.println("Enter An Option: ");
            System.out.println("1 - Load Student List: ");
            System.out.println("2 - Find Student: ");
            System.out.println("3 - Exit: ");
            option = s.nextInt();
            if (option == 1) {
                st = new StudentFileReader();
                System.out.println("List Loaded Sucessfully");
            }
            if (option == 2) {
                if (st == null) {
                    System.out.println("First Load the List!");
                } else {
                    System.out.println("Enter Id of the Student: ");
                    int id = s.nextInt();
                    System.out.println("Student Name: "+st.get(id)+"\n");
                }
            }
        }
    }
}
