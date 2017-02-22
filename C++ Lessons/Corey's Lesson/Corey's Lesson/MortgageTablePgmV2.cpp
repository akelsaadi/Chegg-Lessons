/*#include <iostream>
#include <iomanip>
#include <fstream>
#include <cmath>

using namespace std;

//Reads the inputs principal amount, rate of interest, and number of payments.
void readInputs(double &presentValue, double &rateOfInterest, int &numOfPayments, double &tax_pm)
{
	cout << "Enter the loan amount: ";
	cin >> presentValue;
	cout << "Enter the yearly rate of interest(as a percentage): ";
	cin >> rateOfInterest;
	rateOfInterest = (rateOfInterest / 100) / 12;
	cout << "Enter the number of payments (in months): ";
	cin >> numOfPayments;
	cout << "What is the tax amount per year? $";
	cin >> tax_pm;
	tax_pm = tax_pm / 12;
}

//Calculates the EMI per payment, given the inputs.
void EMICalc(double presentValue, double rateOfInterest, int numOfPayments, double tax_pm, double &EMI)
{
	EMI = (rateOfInterest * presentValue) / (1 - pow((1 + rateOfInterest), (-1 * numOfPayments)));
	EMI = floor(EMI * 100 + 0.5) / 100;
	EMI = EMI + tax_pm;
}

//Calcualtes the total amount of tax paid each year
void calculateTax(double tax, int numOfPayments)
{
	double No_of_Payments_in_years = numOfPayments / 12;
	double totalTax = tax * No_of_Payments_in_years;
	double tax_pm = totalTax / numOfPayments;
}

void printTable(double pV, double roI, int noP, double emi, double tax_pm)
{
	//For including thousand separator
	locale system_locale("");
	cout.imbue(system_locale);
	cin.imbue(system_locale);
	ofstream outFile;
	//For including thousand separator
	outFile.imbue(system_locale);
	outFile.open("MortgageTablePgmV2_Results.txt");
	outFile << "Principal\t$" << pV << "\t\tPayment\t$" << fixed << setprecision(2) << emi << endl;
	outFile << "Annual Interest\t" << fixed << setprecision(2) << roI * 12 * 100 << "%\t\tTerm\t" << noP << " Months" << endl << endl;

	//Printing table header with proper formatting
	outFile << "Payment" << "\t\t\t" << "Amount" << "\t\t\t" << "Principal" << "\t\t" << "Interest"
		<< "\t\t" << "Tax" << "\t\t" << "Principal Balance" << endl;

	double interest, principal;
	double totemi = 0, totprin = 0, totint = 0, tottax = 0, totpV = 0;

	for (int i = 0; i < noP; i++)
	{
		interest = pV * roI;
		if (interest < 0)
		{
			interest = 0;
		}
		principal = (emi - interest) - tax_pm;
		if (principal < 0)
		{
			principal = 0;
		}
		pV = pV - principal;
		if (pV < 0)
		{
			pV = 0;
		}

		//Writing calculated values to file with required format
		outFile << right << setw(7) << (i + 1);
		outFile.precision(2);
		outFile << right << setw(17) << fixed << "$" << emi;
		outFile << right << setw(19) << fixed << "$" << principal;
		outFile << right << setw(16) << fixed << "$" << interest;
		outFile << right << setw(12) << fixed << "$" << tax_pm;
		outFile << right << setw(22) << fixed << "$" << pV << endl;
		totemi += emi;
		totprin += principal;
		totint += interest;
		tottax += tax_pm;
	}

	outFile << right << setw(7) << "Totals";
	outFile.precision(2);
	outFile << right << setw(17) << fixed << "$" << totemi;
	outFile << right << setw(18) << fixed << "$" << totprin;
	outFile << right << setw(15) << fixed << "$" << totint;
	outFile << right << setw(11) << fixed << "$" << tottax;
}

int main()
{
	double presentValue, rateOfInterest, EMI, tax, tax_pm;
	int numOfPayments;
	readInputs(presentValue, rateOfInterest, numOfPayments, tax_pm);
	EMICalc(presentValue, rateOfInterest, numOfPayments, tax_pm, EMI);
	calculateTax(tax_pm, numOfPayments);
	printTable(presentValue, rateOfInterest, numOfPayments, EMI, tax_pm);
	double totalInterest = EMI * numOfPayments - presentValue;
	cout << "Total interest paid: " << totalInterest << endl;
	return 0;
}*/