
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
    
    // this is a 2d array with the index we wanna find the max for as a parameter
    public static int max(int[][] array, int index) { 
		int result = 0; // this is a holder, usually set to the least number, could be 0 if only asked for positive numbers or could be negative infinity if asked for both negative and positive numbers
			for (int y = 0; y < array[0].length; y++) { // we loop over the length of our array, make sure to have the index (0) otherwise we will only loop over 3 instances and not 4
				if (result < array[index][y]) { // this is comparing our holder to whatever we have in our 2d array. 
					result = array[index][y]; //if whatever we have in our 2d array is greater than the holder. then we set our new result to the number in our 2d array.
				}
			}
		// This is a run of iterations based on our main (at array[1][0] we have 30, 30 > 0, our new result is 30.. 
                        //at array[1][1], we have 20, 20 < 30.. the result stays 30, 
                        //at array[1][2] we have 35, 35 > 30, our new result is 35. 
                        //at array[1][2] we have 40, 40>35, our new result is 40, 
                        // we now return 40 as our result
                        // note how we only went how our first dimension of our 2d array did not change (that's because we set it to 1 when calling max(test, 1)<- this 1 is what we will use in the first dimension )

		return result; // returning the result 
	}
    public static void main (String[] args)
    {
        
        int[][] test = {{4,7,9,20},{30,20,35,40},{60,70,80,20}};
        System.out.println(max(test, 1));
    }
}

