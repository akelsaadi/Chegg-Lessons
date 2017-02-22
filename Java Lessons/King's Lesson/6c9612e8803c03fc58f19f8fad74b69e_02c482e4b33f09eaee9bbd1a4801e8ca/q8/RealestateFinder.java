package q8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class RealestateFinder {

    static int count = 0;

    public static void main(String[] args) {

        Scanner in = null;
        Realestate r = new Realestate();
        try {
            in = new Scanner(new FileReader("realestate.txt"));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        int i = 0;
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] item = line.split(" ");
            r.location[i] = item[0];
            r.price[i] = Integer.parseInt(item[1]);
            r.description[i] = item[2];

            i++;
            count++;
        }

        print();
        
        char ch = 'y';
        Scanner s = new Scanner(System.in);
        while (ch == 'y' | ch == 'Y') {

            System.out.println("Enter Sort Type: ");
            System.out.println("1 - Sort per price: ");
            System.out.println("2 - Sort per Location: ");
            System.out.println("3 - Exit: ");
            int option = s.nextInt();
            if (option == 1) {
                Arrays.sort(r.price);
            } else if (option == 2) {
                Arrays.sort(r.location);
            } else if (option == 3) {
                break;
            }
        }
        
        print();

    }

    static void print() {
        Realestate r = new Realestate();
        for (int i = 0; i < count; i++) {
            System.out.println("Location: " + r.location[i] + ", Price: " + r.price[i] + ", Description: " + r.description[i]);
        }
    }
}
