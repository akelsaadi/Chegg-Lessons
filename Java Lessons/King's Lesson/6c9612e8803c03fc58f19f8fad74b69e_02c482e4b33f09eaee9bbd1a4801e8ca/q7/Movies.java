package q7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Movies {

    public static void main(String[] args) {

        String name[] = new String[50];
        String genre[] = new String[50];
        int time[] = new int[50];

        Scanner s = null;
        InsertionSort is = new InsertionSort();
        try {
            s = new Scanner(new FileReader("movies.txt"));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        int i = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] item = line.split(" ");
            name[i] = item[0];
            genre[i] = item[1];
            time[i] = Integer.parseInt(item[2]);
            System.out.println(" "+name[i]);
            i++;
        }

        char ch = 'y';
        while (ch == 'y' | ch == 'Y') {

            System.out.println("\nEnter Field you want to sort: ");
            System.out.println("1 - Name");
            System.out.println("2 - Genre");
            System.out.println("3 - Time");
            int option = in.nextInt();
            if(option == 1){
                Arrays.sort(name);
            }
            else if(option == 2){
                Arrays.sort(genre);
            }
            else if(option == 3){
                is.sort(time);
            }
            
            System.out.println("Want to Sort More?");
            ch = in.next().charAt(0);
        }
    }
}
