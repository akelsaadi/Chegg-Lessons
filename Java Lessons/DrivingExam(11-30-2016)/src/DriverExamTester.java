import java.util.Scanner;//imports scanner class


public class DriverExamTester {//begins DriverExamTester

	 public static void main(String[] args){//begins main
	 
	  Scanner scan = new Scanner(System.in);//creates scanner
	  System.out.println("Enter your answers below.\n");

	  char[] answers = new char[20];

	  // request an answer for each question
	  for(int x = 0; x < answers.length; x++){
			
			char input;
			do{
				//gets input and make it Capital case
				  System.out.print(x + 1 + ". ");
				  input=scan.next().charAt(0);
				  
				  if(input=='a')
					  input='A';
				  else if(input=='b')
					  input='B';
				  else if(input=='c')
					  input='C';
				  else if(input=='d')
					  input='D';
				  else
					  input=input;  
			}
			// get input until input is valid
			while(input < 'A' || input >'D');

			// store answer
			answers[x] = input;
	  }

	  		// print outputs
	  
	  DriverExam driver = new DriverExam(answers) {};
	  System.out.println();
	  if(driver.passed()){
		  System.out.println("You Passed: Good for you...");
	  }
	  else{
		  System.out.println("You did not pass: ");
	  }
	  
	  
	  System.out.println();
	  System.out.println("Total Correct: " + driver.totalCorrect() + "\n");
	  System.out.println("Total Incorrect: " + driver.totalIncorrect() + "\n");
	  
	  int[] missed = driver.questionsMissed();
	  if(missed.length > 0) {
	  	System.out.print("Questions missed: ");
	  	for(int x = 0; x < missed.length; x++)
	  		System.out.print(" " + missed[x]);
	  	System.out.println();
	  }
	  
	  
	  
  }//ends main
}//ends DriverExamTester
