#include<iostream>
#include<iomanip>
#include<cstdlib>
#include<ctime>

using namespace std;


// Set global variables.
char playAgain;
int	 dieOne,
dieTwo,
sum,
point;
double startingAmount = 100.00,
balanceAmount = startingAmount,
wager;
const int 	MIN_VALUE = 1,
MAX_VALUE = 6,
CRAPS_VAL1 = 2,
CRAPS_VAL2 = 3,
CRAPS_VAL3 = 12;

				
double getWager(double balanceAmount);

int rollDice();





int main()
{

	do {

		getWager(balanceAmount);
		

		sum = rollDice();


		// Outcomes
		if (sum == 7 || sum == 11)
		{
			cout << "You won! " << endl;
			balanceAmount += wager;

		}
		else if (sum == CRAPS_VAL1 || sum == CRAPS_VAL2 || sum == CRAPS_VAL3)
		{
			cout << "You lose! Good day, sir! " << endl;
			balanceAmount -= wager;

		}
		else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10)
		{
			cout << "The point is: " << sum << endl << endl;
			point = sum;

			do
			{
				dieOne = (rand() % (MAX_VALUE - MIN_VALUE + 1)) + MIN_VALUE;
				dieTwo = (rand() % (MAX_VALUE - MIN_VALUE + 1)) + MIN_VALUE;
				sum = dieOne + dieTwo;

				cout << "The player rolled: " << dieOne << " + " << dieTwo << " = " << sum << endl;

				if (sum == point)
				{
					cout << endl << "You rolled your point! You won! " << endl;
					balanceAmount += wager;

				}
				else if (sum == 7)
				{
					cout << endl << "You seven'd out and lost! " << endl;
					balanceAmount -= wager;
				}
			} while (sum != point && sum != 7);

		}

		// Play again?
		cout << endl << "Play again? (y)es or (n)o: ";
		cin >> playAgain;

		cout << endl;


		while (playAgain != 'n' && playAgain != 'N' && playAgain != 'y' && playAgain != 'Y')
		{
			cout << "Please enter a valid answer: (y)es or (n)o: ";
			cin >> playAgain;

		}




	} while ((playAgain == 'y' || playAgain == 'Y') && balanceAmount > 5);

	// Cordial or chastising outro depending on balance amount. 
	if (balanceAmount >= 0 && (playAgain == 'N' || playAgain == 'n'))
	{
		cout << endl << "--------------------------------" << endl;
		cout << "The final balance is $" << balanceAmount << ". Goodbye, come back soon. ";

	}

	system("pause");
	return 0;
}


double getWager(double balanceAmount)
{
	cout << "You have $" << fixed << setprecision(2) << balanceAmount << " available." << endl;
	cout << "How much would you like to wager (Minimum wager: $5.00)? ";
	cin >> wager;

	// Sets the lower and upper limit of the wager.
	while (wager < 5)
	{
		cout << "Please enter a wager of $5.00 or greater ";
		cin >> wager;
	}
	while (wager > balanceAmount)
	{
		cout << "You can't do that, you have $" << balanceAmount << " to bet. Try again. ";
		cin >> wager;

	}
	balanceAmount -= wager;

	return wager;

}





int rollDice()
{
	// Seeds and performs random operations to set dice values.
	srand(time(0));
	dieOne = (rand() % (MAX_VALUE - MIN_VALUE + 1)) + MIN_VALUE;
	dieTwo = (rand() % (MAX_VALUE - MIN_VALUE + 1)) + MIN_VALUE;

	// Find the sum of the dice roll.
	sum = dieOne + dieTwo;

	cout << endl << "The player rolled: " << dieOne << " + " << dieTwo << " = " << sum << endl << endl;

	return sum;

}



