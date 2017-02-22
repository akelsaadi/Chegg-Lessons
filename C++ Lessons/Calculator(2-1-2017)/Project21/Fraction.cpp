//Student ID: 913053908
//Name: Bardia Ghayoumi
// Fraction.cpp

#include "Fraction.h"
#include <iostream>
#include <stdexcept>
using namespace std;

Fraction::Fraction(void) {
	numer = 0;
	denom = 1;
}

Fraction::Fraction(int a, int b) {
	numer = a;
	denom = b;
}


void Fraction::scanFraction(Fraction &frac) {
	if (frac.denom == 0) {
		throw invalid_argument("Error: zero denominator");
	}
	else if (frac.denom < 0) {
		frac.numer *= -1;
		frac.denom *= -1;
	}
}
int Fraction::find_gcd(const Fraction n1, const Fraction n2) {
	int gcd, remainder, n1_denom, n2_denom;
	n1_denom = n1.denom;
	n2_denom = n2.denom;

	remainder = n1_denom % n2_denom;
	while (remainder != 0)
	{
		n1_denom = n2_denom;
		n2_denom = remainder;
		remainder = n1_denom % n2_denom;
	}
	gcd = n2_denom;
	return gcd;
}


ostream& operator<<(ostream &output, const Fraction &frac) {
	if (frac.denom == 1) {		
		output << frac.numer;
	}
	else if (frac.denom == frac.numer) {	
		output << '1';
	}
	else if (frac.numer % frac.denom == 0) {	
		output << frac.numer / frac.denom;
	}
	else {
		output << frac.numer << "/" << frac.denom;
	}
	return output;
}
istream& operator>>(istream &input, Fraction &frac) {
	char slash;	
	int numerator, denominator;
	input >> numerator >> slash >> denominator;
	frac.setFraction(numerator, denominator);
	frac.scanFraction(frac);
	return input;
}
Fraction operator+(const Fraction &n1, const Fraction &n2) {
	Fraction fractmp;
	int gcd, common_denom;
	gcd = fractmp.find_gcd(n1, n2);
	common_denom = n1.getDen()*n2.getDen();
	fractmp.setFraction((n1.getNum()*n2.getDen() + n2.getNum()*n1.getDen()), common_denom); 
	return fractmp.reduce_fraction(fractmp, gcd);
}
Fraction operator-(const Fraction &n1, const Fraction &n2) {
	Fraction fractmp;
	int gcd, common_denom;
	gcd = fractmp.find_gcd(n1, n2);
	common_denom = n1.getDen()*n2.getDen();
	fractmp.setFraction((n1.getNum()*n2.getDen() - n2.getNum()*n1.getDen()), common_denom); 
	fractmp = fractmp.reduce_fraction(fractmp, gcd);
	return fractmp;
}
const Fraction& Fraction::operator=(const Fraction& rhs) {
	if (&rhs == this) {
		return *this;
	}
	numer = rhs.numer;
	denom = rhs.denom;
	return *this;
}

int Fraction::getNum() const {
	return numer;
}

int Fraction::getDen() const {
	return denom;
}
Fraction Fraction::reduce_fraction(Fraction &frac, int gcd) {
	frac.numer = frac.numer / gcd;
	frac.denom = frac.denom / gcd;
	return frac;
}

void Fraction::setFraction(int n, int d) {
	numer = n;
	denom = d;
}
