#include "Alien.h"
#include <iostream>
using namespace std;

//default constructor
Alien::Alien()
{
	height = 60;
	weight = 100;
	gender = 'M';
}//end constructor

 //non-default constructor. (will set to default if invalid argument)
Alien::Alien(int h, int w, char g)
{
	if (h < 0)
	{
		cout << "You entered and invalid height!"
			<< "The height is now set to 60 by default." << endl;
	}
	else
	{
		height = h;
	}

	if (w < 0)
	{
		cout << "You entered an invalid weight!"
			<< "The weight is now set to 100 by default" << endl;
	}
	else
	{
		weight = w;
	}

	if (g == 'M' || g == 'F')
	{
		gender = g;
	}
	else
	{
		cout << "You entered an invalid gender!"
			<< "The gender is now set to Male by default" << endl;
		gender = 'M';
	}
}//end non-default constructor

Alien::~Alien() {}

//begin getters and setters
void Alien::setHeight(int h)
{
	if (h <= 0)
	{
		cout << "You entered and invalid height!"
			<< "The height is now set to 60 by default." << endl;
	}
	else
	{
		height = h;
	}
}

void Alien::setWeight(int w)
{
	if (w < 0)
	{
		cout << "You entered an invalid weight!"
			<< "The weight is now set to 100 by default" << endl;
	}
	else
	{
		weight = w;
	}
}

void Alien::setGender(char g)
{
	if (g == 'M' || g == 'F')
	{
		gender = g;
	}
	else
	{
		cout << "You entered an invalid gender!"
			<< "The gender is now set to Male by default" << endl;
		gender = 'M';
	}
}

int Alien::getHeight()
{
	return height;
}

int Alien::getWeight()
{
	return weight;
}

char Alien::getGender()
{
	return gender;
}
//end getters and setters. 

//getGenderValue will assign appropriate int value according to gender 
static int getGenderValue(char g)
{
	int genderValue = 2;
	if (g == 'F')
	{
		genderValue = 3;
	}
	return genderValue;
}//end getGenderValue

 //getStatusPoints will calculate and return status points based on height, weight and gender value
static int getStatusPoint(Alien alien)
{
	int genderValue = getGenderValue(alien.getGender());
	return alien.getHeight() * alien.getWeight() * genderValue;
}//end getStatusPoints

 //begin overloaded operators
bool Alien::operator==(const Alien& rhs) const
{
	return getStatusPoint(*this) == getStatusPoint(rhs);
}

bool Alien::operator!=(const Alien& rhs) const
{
	return getStatusPoint(*this) != getStatusPoint(rhs);
}

bool Alien::operator<=(const Alien& rhs) const
{
	return getStatusPoint(*this) <= getStatusPoint(rhs);
}

bool Alien::operator>=(const Alien& rhs) const
{
	return getStatusPoint(*this) >= getStatusPoint(rhs);
}

bool Alien::operator<(const Alien& rhs) const
{
	return getStatusPoint(*this) < getStatusPoint(rhs);
}

bool Alien::operator>(const Alien& rhs) const
{
	return getStatusPoint(*this) > getStatusPoint(rhs);
}
//end overloaded operators