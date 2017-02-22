/*
 * Kevin Huynh
 * CMSC 256 - Data	Structures	And	Object	Oriented	Programming
 * Project 2 - MediaList
 * The purpose is a main class called MediaList.
 */
import java.util.*;

import java.io.*;

//class MediaList

public class MediaList {

    // main method

    public static void main(String[] args)throws FileNotFoundException, IOException {

        //prints information of the student who done this project

        //printHeading();

        //array of Song class

        Song s[] = new Song[70];

        //array of Image class
        Image i[] = new Image[70];

        int count = 0; //counter for array

        //opens the file which is specified at command line

        Scanner file = new Scanner(new File(args[0].toString()));


        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);
        String str = null;
        while((str=br.readLine())!=null)
        {
            if(str.contains("S"))
            {
                //store it into image array

            }else if(str.contains("I"))
            {
                //store it into image array

            } else {
                throw new IllegalArgumentException("Error: File can not be null. Please enter a file name into the command line.");
            }
        }
        //reads data from file and stores in array

        while (file.hasNext())

        {

            StringTokenizer st = new StringTokenizer(file.nextLine(), ":");

            s[count] = new Song(st.nextToken(), st.nextToken(), st.nextToken(), Long.parseLong(st.nextToken()));

            count++;

        }

        //prompts user if they want to display songs or images list

        System.out.print("Enter S (song) or I (image) to see a display of all of the DigitalMedia of that type. ");

        Scanner input = new Scanner(System.in);

        String choice = input.nextLine();

        //if S is entered displays songs, if I is entered displays images

        if (choice == "S" || choice == "s") {
            //display list of songs, grouped by album and in alphabetical order by song title

        } else if (choice == "I" || choice == "i") {
            //display list of images in alphabetic order by image name
        } else {
            //if anything other then S or I are entered, throws error
            throw new IllegalArgumentException("Error: You must enter either S or I.");
        }
    }

    private static void printHeading()

    {
        System.out.println("Kevin Huynh");
        System.out.println("Project 2");
        System.out.println("CMSC 256");
        System.out.println("Spring 2017");
        System.out.println();

    }

}