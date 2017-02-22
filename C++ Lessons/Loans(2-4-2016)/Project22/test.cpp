#include <iostream>
#include <iomanip>
using namespace std;


void Loan()
{
	double balance;
	double interestRate;
	double monthlyPayment;
	double interest;
	double totalInterest;
	double principal;
	int month;

	totalInterest = 0;
	principal = 0;
	month = 0;

	cout << "Loan Amount: ";
	cin >> balance;

	cout << "Interest Rate (\% per year): ";
	cin >> interestRate;

	cout << "Monthly Payments: ";
	cin >> monthlyPayment;

	if (monthlyPayment <= balance * (interestRate * .01 / 12))
	{
		cout << "Monthly payment too low.";
	}

	else
	{

		

		while (balance > 0)
		{
			month++;
			if (balance < monthlyPayment)
			{
				monthlyPayment = balance;
			}

			interest = balance * .01 * (interestRate / 12);
			totalInterest += interest;
			principal = monthlyPayment - interest;
			balance -= principal;
			

		}
		cout << "****************************************************\n";
		cout << "It takes " << month << "months to pay off the loan.\n";
		cout << "Total interest paid is: $" << totalInterest <<endl;
	}

}

int main()
{
	Loan();
	system("pause");
	return 0;
}