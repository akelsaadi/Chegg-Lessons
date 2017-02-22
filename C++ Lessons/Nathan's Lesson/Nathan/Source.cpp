#include <iostream>
#include <string>
using namespace std;
int main()
{
	string ssn = " ";
	cout << " Enter SSN: ";

	getline(cin, ssn);

	bool test = 1;

	if ((ssn.length() != 11))
	{
		test = 0;
	}
	else if (!(isdigit(ssn[0])))
	{
		test = 0;
	}
	else if (!(isdigit(ssn[1])))
	{
		test = 0;
	}
	else if (!(isdigit(ssn[2])))
	{
		test = 0;
	}
	else if (!(isdigit(ssn[4]))) // notice here we used 4
	{
		test = 0;
	}

	else if (!(isdigit(ssn[5])))
	{
		test = 0;
	}
	else if (!(isdigit(ssn[7])))
	{
		test = 0;
	}
	else if (!(isdigit(ssn[8])))
	{
		test = 0;
	}
	else if (!(isdigit(ssn[9])))
	{
		test = 0;
	}
	else if (!(isdigit(ssn[10])))
	{
		test = 0;
	}

	cout << "SSN Entered: " << ssn << "is: ";

	if (test)
	{
		cout << "valid";
	}
	else
	{
		cout << "invalid";
	}

	system("pause");
	return 0;

}