import java.util.*;

 class Main {

    // these are all public variables and can be accessed by any methods we create later.
    // instead of having them inside of the static main, we can declare them in the Class and use them throughout 
    int scores[] = new int[7]; // create array of integers to store the scores;
    String names[] = {"Doc","Grumpy","Happy","Sleepy","Dopey","Sneezy","Bashful"}; //predeclare the names and store in array of strings
    int scoresDev[] = new int[7];// create array of integers to store the standard deviations
    double avg; // average is double
    double div = 7; // this is a holder as a total of number of students(You had that previously in your code)
    
    
    public int[] ReadData()
    {   
        Scanner keyboard = new Scanner(System.in);
         for(int i=0; i<7; i++)
            {
                System.out.println("Type in score for " + names[i]); // looping around all the name and ask for the scores to store them in the array scores
                scores[i] = keyboard.nextInt();
            }
         return scores; // we return the scores because they will be used throughout the other methods.
    }
    public void ComputeAverage()
    {
        int total =0; 
        for(int i=0; i < 7; i++)
        {
            total += scores[i]; //adding the all of the scores so we can use that to divide and get the average
        }
        avg = total/div; //divide the total of scores with the holder we set earlier
        System.out.println("The average of the scores is: " +avg);
    }
    public void ComputeDeviation()
    {
        for (int j=0; j<7; j++)
        {
            scoresDev[j] = scores[j] - (int)avg; // here we're looping around and storing every score - avg into the array ScoresDev which will in turn give us the Deviation
        }
    }
    public void Display()
    {   //This is just for formatting, we Seperate everything by Tabs using "\t"
        System.out.println("Name" + "\t" +"Grade" + "\t" + "Mean Deviation");
        for (int k=0; k<7; k++) // we loop around all our arrays and display them accordingly
        {
            System.out.println(names[k] +"\t" + scores[k] + "\t" + "("+scoresDev[k]+")");
        }
    }
    
    public static void main (String args[])
    {
        //Create an object of the class Main 
        Main tester = new Main();
        tester.ReadData();//use the dot operator to call the readmethod
        tester.ComputeAverage(); // we then call to compute the average
        tester.ComputeDeviation();// then call to compute the deviation
        tester.Display();// and finally displaying everything here
         
    }
}

