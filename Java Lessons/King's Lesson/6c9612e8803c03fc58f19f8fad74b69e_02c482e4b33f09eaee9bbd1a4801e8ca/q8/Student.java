package q8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Student {

    Scanner in = null;
    public String[] name = new String[50];
    public double[] GPA = new double[50];
    public int[] ID = new int[50];

    Student() {
        try {
            in = new Scanner(new FileReader("student.txt"));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    void readFile() {

        int i = 0;
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] item = line.split(" ");
            name[i] = item[0];
            GPA[i] = Double.parseDouble(item[1]);
            ID[i] = Integer.parseInt(item[2]);
            i++;
        }
    }

}

