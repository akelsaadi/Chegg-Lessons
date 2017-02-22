
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class TwoB 
{
    public static void main(String [] args) 
    {
        int y; // declaring integer y
        y = 2; // setting integer y to 2
        for (int i = 7; i > 5; i--)  // our loop starts at i = 7, we go downwards because of the ( -- ) 
            //and  if it gets to i to 5 it will leave, so basically we're iterating twice only...
        {
            do {  // a do while loop always executes at least once regardless of the condition of the while
                y = y * 2 + 1; //because of that our y now becomes 5
                System.out.println(y); // we print out 5 
               } while (y > 5); //we try to do our 2nd iteration of the while loop, we fail as our y is 5 and that doesn't meet the condition
        y = y - i; // we subtract y by our i, which is 7, so now our y becomes -2
        System.out.println(i + " " + y); // we print out the i ( which is 7 ) and our y ( which is 2)
        } 

        // now on to the 2nd iteration of the for loop. explained below
        //so now for our 2nd iteration, our i is 6, still greater than 5, so we continue with our for loop
        // hit the do while loop, have to execute once regardless of the condition
        // we now get to the y = y * 2 + 1 statement ( we multiply y by 2 and add it to 1.. our y is -2 (from above ) so our y is -3 a
        //we print out y which is -3
        // our while loop's condition is that y has to be greater than 5, fails, we leave the while loop
        // now we subtract y by i ( our i is 6 ) so y = -3 - 6 = -9 
        //we print out i and y, our i = 6, our y = -9 
    }
}
