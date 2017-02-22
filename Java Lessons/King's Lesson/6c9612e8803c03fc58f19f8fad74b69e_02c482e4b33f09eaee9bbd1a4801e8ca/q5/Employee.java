package q5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Employee {

    Scanner in = null;
    public String[] fname = new String[50];
    public String[] lname = new String[50];
    public String[] skill = new String[50];
    public double[] wage = new double[50];
    public int[] ID = new int[50];

    Employee() {
        try {
            in = new Scanner(new FileReader("Q5.txt"));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    void readFile(int size) {

        int j=0, k=0, l=0, m=0, n=0;
        
        while (in.hasNext()) {
            String line = in.nextLine();
            if (line.contains(":")) {
                for (int i = 0; i < size; i++) {
                    if (in.hasNext()) {
                        int index1 = line.indexOf(":");
                        int index2 = line.indexOf(",");
                        String item = line.substring(index1 + 3, index2 - 1);
                        //System.out.println("substring[" + i + "] = " + item);
                        line = in.nextLine();
                        if (i == 0) {
                            fname[j] = item;
                            j++;
                        } else if (i == 1) {
                            lname[k] = item;
                            k++;
                        } else if (i == 2) {
                            skill[l] = item;
                            l++;
                        } else if (i == 3) {
                            wage[m] = Double.parseDouble(item);
                            m++;
                        } else if (i == 4) {
                            ID[n] = Integer.parseInt(item);
                            n++;
                        }
                    }
                }
            }
        }
    }
}
