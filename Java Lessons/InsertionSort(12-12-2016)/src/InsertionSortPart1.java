import java.util.Scanner;

public class InsertionSortPart1 {

	static void showInsertionSortSteps(int[] a) {
	
		boolean done = false;
		int i = a.length - 1;
		int temp = a[a.length - 1];
		
		while (!done) {
		
			if (i == 0) {
				a[i] = temp;
				done = true;
			}
			else if (a[i-1] > temp) {
				a[i] = a[i-1];
			}
			else {
				a[i] = temp;
				done = true;
			}
			
			for (int j = 0; j < a.length; j++) {
		    	 System.out.print(Integer.toString(a[j]) + " ");
		    }
			System.out.print("\n");
			
			
			i--;
		}
		
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    int[] a;
	    int n;
	    
	    n = in.nextInt();
	    a = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	    	 a[i] = in.nextInt();
	    }

	    showInsertionSortSteps(a);
	    
	    in.close();
	}
	
}