#include <iostream> // let me know if you don't know what those are.
using namespace std;

//Main starts here
int main() {
	// Output to screen what the program does
	cout << "This program wil calculate the cost of your long-distance phone call.\n";
	//Declaring choose as a char, we use that below.
	char choose;
	//Give the user an option if he would like to proceed and use our calculator
	cout << "Would you like to proceed?. Type Y for yes or N for no.\n";
	//Here we're asking the user to input his option using the variable choose that we declared above
	cin >> choose;
	//Now we make a while loop with the condition that if choose is equal to 'Y' or 'y' we will dive inside the while loop.
	//if the condition is not met, we will leave the while loop.
	while (choose == 'Y' || choose == 'y') 
	{
		//declaring all the variables we will be using for the calculations and the days.
		char day; //Your professor wanted us to use two chars for the days, so here we have 1 char
		char day2; // Here is the second char. So for example if a user wants to Calculate for monday, they will input 'Mo', the 'M' is stored in day, the 'o' is stored in day 2.
		int time1; //same thing for the time, he wanted the user to enter the time in this format: 13:30, so we have an int then a char then an int. (13 is an int, the colon is a char and the 30 is an int)
		char col;
		int time2;
		int duration;//Declaring the duration (how many minutes was the call ) 

		cout << "Input the day of the call in the following format :\n"; // Outputting some instructions and guidelines for the user
		cout << "For Monday type 'Mo'" << endl;
		cout << "For Tuesday type 'Tu'" << endl;
		cout << "For Wednesday type 'We' " << endl;
		cout << "For Thursday type 'Th'" << endl;
		cout << "For Friday type 'Fr' " << endl;
		cout << "For Saturday type Sa" << endl;
		cout << "For Sunday type 'Su'" << endl;
		cout << "This program is case-sensitive, so please use the specified symbols\n";
		//Now that we told the user what he has to enter, we prompt them to enter it with 'cin' followed by day and day1 like i explained above.
		cin >> day >> day2;

		//Tell the user how to input the time
		cout << "Input the time of the call in 24 hour notation/military time. " << endl;
		cout << "Example: 1:30 pm is 13:30 or 7:45 am is 7:45. etc.  " << endl;
		//Same thing here... so when the user inputes 13:30, 13 will be in time1, the colon will be in col, and the 30 will be in time2.
		cin >> time1 >> col >> time2;
		cout << "What is the duration of the call in minutes?" << endl;// ask user for the duration
		//prompt user to enter the duration
		cin >> duration;

		//Now, day and day2 combined is equal to Mo, Tu, We, Th, we branch to the following if statement, if not we will go to the (else if) at the bottom
		if (day == 'M' && day2 == 'o' || day == 'T' && day2 == 'u') //Continue same with Wednesday thursday friday and saturday.
		{

			//Here we are combining time1 and time2, so basically 8:00 will be 800 and 18:00 will be 1800
			//time has to be between 8:00 am and 6:00 pm, so we do the comparison, if it's >= 800 and <= 1800) then we branch inside the if statement
			//now if that's the case then we do the calculations given by your instructor. Which are $0.40 per minute
			if ((time1 && time2 >= 800) && (time1 && time2 <= 1800)) 
			{
				//here we declare variable rate as a float (floats can have decimals in them). We do the math (duration * 0.40 ) and store it in rate 
				float rate = .40*duration; //Calulates the cost of the phone call
				cout << "the phone call cost $" << rate << endl; // here we are outputing the rate we got from above

			}
			else 
			{
				//If the time is not between 800 and 1800 then we use this rate.
				float rate = .25*duration;
				cout << "the phone call cost $" << rate << endl;
			}
			//customer has ID
			//call list invoice whenever customer clicks pay
			//if name == Ahmad
			//"customer": ahmad 

		}
		//if the day is not monday, tuesday, wednesday, thursday. we have this else statement for it.
		//now if user enters that the day is Sa or Su.. then we branch in the if statement. 
		else if (day == 'S' && day2 == 'a' || day == 'S' && day2 == 'u') //Make sure to include SA or sa or sA.... as in include all cases.
		{
			float rate = duration*.15;
			cout << "the phone call cost $" << rate << endl;
		}
		
		cout << "Would you like to repeat this program? Y/N.\n";
		cin >> choose;
	
	}

		
		system("pause");
		return 0;
}

	

