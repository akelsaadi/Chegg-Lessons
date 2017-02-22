
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
public class Max {	
    
    // Question said not to worry about this ( I have it only for testing purposes )
    public static int findmax(int[] nums){
		int max = nums[0];
		for(int i = 0 ;i<nums.length ; i++){
			if (nums[i]>max){
			max = nums[i];
			}
		}
		return max;
	}
    
    // This is where you start
    public static void main(String[] args) {
        // Declare the array of integers as 10(Based on the question
        int[] numArray = new int[10];
        int sum =0; // Declare a sum holder to calculate the sum ( will be used for the mean) 
        Scanner keyboard = new Scanner(System.in); // This is a scanner, it is used to grab the users input
        for (int i = 0; i<numArray.length; i++) //we now for loop around the length of the array of integers (numArray)
        {
            // This is just for explanation purposes not required, used to direct user to enter the numbers "
            System.out.println("Enter the " + i + "'th Number: ");
            numArray[i] = keyboard.nextInt(); // We now grab whatever the user entered and store it in the array of integers (numArray), if the user for the first iteration enters 40, then numArray[0] will be = 40. if the user for the second iteration enters 50, then numArray[1] will be 50, etc...
            sum = sum + numArray[i]; // we add every number entered to sum, so if the user on the first iteration entered 40, sum will equal to 40, if user on the second iteration entered 50, the sum will equal to (40 + 50).. for the third iteration the user enters 70, the sum will equal to ( 90 + 70 ).. etc.
            

        }
        findmax(numArray); // now after we're done grabbing the user input, we call the findMax method and have the numArray as our parameter ( So we can get the max of the numArray)
        int mean;
        mean = sum / numArray.length; //This is how we calculate the mean, we use the sum that we accumulated at the top and divide it by the length of the numArray (in our case our length is 10)
        System.out.println("Mean is: " + mean); // this is just to print out whatever we got in the mean.
    }
}

