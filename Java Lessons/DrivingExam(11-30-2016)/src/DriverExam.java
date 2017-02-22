public class DriverExam {//starts DriverExam

		private char[] key = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
						'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A' };
		private char[] answers;

	public DriverExam(char[] answers){//constructor
		this.answers = answers;
		
	}
	
	public int totalCorrect(){//counts the total number of questions correct
		int correct = 0;
		for (int x = 0; x < key.length; x++){
			if (key[x] == answers[x])
			correct++;
		}
		return correct;
	}
	
	public boolean passed (){//checks if the total correct is greater than 14
		return (totalCorrect() > 14);
	}
	
	
	public int totalIncorrect(){//checks the total number of questions incorrect
		int incorrect = 0;
		incorrect = key.length - totalCorrect();
		return incorrect;
	}
	
	public int[] questionsMissed(){//checks for questions that were miss and return the number
		  
	int size = key.length - totalCorrect();
	int[] missed = {};
	
	if (size < 1)
		return missed;
	else
		missed = new int [size];
	
	int pos = 0;
	for (int x = 0; x < key.length; x++){
	 if (key[x] != answers[x]){
		missed[pos] = (x + 1);
		pos = pos + 1;
	 		}
		}
		return missed;
	
		}//ends QuestionMissed
	}//Ends DriverExam
