#include <string>
#include <iostream>
#include <stdlib.h>

using namespace std;
const int MonthDays[] = { 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
const string MonthName[] = { "January", "February", "March", "April", "May",
"June", "July", "August", "September", "October", "November", "December" };

class DayOfYear {
	
public:
	int day;
	string month;
	int numDays;

	DayOfYear() {
		month = "January";
		day = 1;
		numDays = 1;
	}

	~DayOfYear() {
	}

	DayOfYear(int d)
	{
		numDays = d;
	}

	int getNumDays()
	{
		return numDays;
	}

	void print()
	{
		int m = 0;
		while (MonthDays[m] < numDays)
		{
			m = (m + 1) % 12;
		}
		if (numDays < 32)
		{
			cout << MonthName[m] << " " << numDays << endl;
		}
		else
		{
			cout << MonthName[m] << " " << numDays - MonthDays[m - 1] << endl;
		}
	}

};