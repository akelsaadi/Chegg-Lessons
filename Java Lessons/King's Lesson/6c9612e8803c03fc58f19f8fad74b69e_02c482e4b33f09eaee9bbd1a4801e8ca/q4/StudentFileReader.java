package q4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StudentFileReader {

    Scanner in = null;

    StudentFileReader() {
        try {
            in = new Scanner(new FileReader("student.txt"));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    String get(int id) {

        while (in.hasNext()) {
            String line = in.nextLine();
            String[] item = line.split(" ");
            if (id == Integer.parseInt(item[0])) {
                return item[1];
            }
        }
        return "Not Found";
    }

}
