package q6;

import java.util.Scanner;

public class StudentSearcher {

    public static void main(String[] args) {

        int size = 6;
        Student st = new Student();
        st.readFile(size);
        System.out.println("The list of possible ID's are: ");
        for (int i = 0; i < size; i += 2) {
            System.out.print(st.ID[i] + " ");
        }

        char ch = 'y';
        boolean found = false;
        Scanner s = new Scanner(System.in);
        while (ch == 'y' | ch == 'Y') {

            System.out.println("\nEnter an ID to search: ");
            int id = s.nextInt();
            for(int i=0;i<size;i++){
                if(id == st.ID[i]){
                    System.out.println("The GPA of searched student is "+st.GPA[i]);
                    found = true;
                }
            }
            if(!found){
                System.out.println("Record Not Found!");
            }
            
            System.out.println("Want to Search Again? ");
            ch = s.next().charAt(0);
        }

    }
}
