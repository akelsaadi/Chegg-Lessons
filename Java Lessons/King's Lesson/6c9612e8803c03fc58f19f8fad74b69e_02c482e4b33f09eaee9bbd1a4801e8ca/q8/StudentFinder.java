package q8;

import java.util.Scanner;

public class StudentFinder {

    public static void main(String[] args) {

        Student st = new Student();
        Scanner s = new Scanner(System.in);
        int size = 5;
        boolean found = false;
        st.readFile();
        System.out.println("Enter first letter of name: ");
        char id = s.nextLine().charAt(0);
        for (int i = 0; i < size; i++) {
            if (id == st.name[i].charAt(0)) {
                System.out.println("Name Found!");
                System.out.println("ID: "+st.ID[i]+", Name: " + st.name[i] + ", GPA: " + st.GPA[i]);
                break;
            }
        }
    }
}
