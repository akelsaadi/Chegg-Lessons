
import java.util.Scanner;

public class a8 {
	
	static Scanner input;
	public final static int MAX_ARRAY_SIZE = 1000;
	
	public static void main(String[] args)
        {
		
            input = new Scanner(System.in);
            int[] store = new int[MAX_ARRAY_SIZE];
            int size;
            size = readNumbers(store);
            printNumbers(store, size);
	}
	
			
	
        
        
        
	//readNumbers asks the user to input numbers then stores them in the array parameter, list. If a number is repeated, it is not stored.
	public static int readNumbers(int[] list)
        {
		
            int number, count = 0;

            System.out.print("Enter a non-negative integer (negative to quit): ");
            number = input.nextInt();

            while ((number >= 0) && (count < MAX_ARRAY_SIZE))
            {

                if (notInArray(list, number))
                {
                    list[count] = number;
                    count++;
                }

                if (count < MAX_ARRAY_SIZE)
                {
                    System.out.print("Enter a non-negative integer (negative to quit): ");
                    number = input.nextInt();
                }
                else
                    System.out.println("the array is now full.");
            }

            return count;
        }
	
			
	
        
        
        
	//notInArray checks whether the the parameter, number, is in the array parameter, enteredArray.
	public static boolean notInArray( int[] enteredArray, int number)
        {
		
            for (int count : enteredArray)
                {
			if (count == number)
			return false;
		}
		return true;
		
	}
	
			
	
        
        
        
	//printNumbers outputs the contents of the arrat parameter, list. numItems is the point where the contents stop being outputted.
	public static void printNumbers(int[] list,  int numItems)
        {
            int count;
            System.out.print("You entered: \n");
            for (count = 0; count < numItems; count++)
            {
                System.out.print(list[count] + " ");
            }
        }
	
}
