#include <iostream>
#include "DayOfYear.cpp"

using namespace std;

int main()
{
	int numDayss;
	cout << "Enter Number of days: ";
	cin >> numDayss;

	DayOfYear d(numDayss);

	//DayOfYear d = 2;

	d.print();

	
	system("pause");

	
	return 0;
	
}