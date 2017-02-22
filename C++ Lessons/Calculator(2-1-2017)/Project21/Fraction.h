#ifndef FRACTION_H
#define FRACTION_H
#include <iostream>
using namespace std;

class Fraction
{
	friend ostream& operator<<(ostream &, const Fraction &);
	friend istream& operator>>(istream &, Fraction &);
	friend Fraction operator+(const Fraction &, const Fraction &);
	friend Fraction operator-(const Fraction &, const Fraction &);
public:
	Fraction(); 
	Fraction(int, int); 
	const Fraction& operator=(const Fraction &);
	Fraction reduce_fraction(Fraction &, int);	
	void setFraction(int, int);
	void scanFraction(Fraction &);			
	int find_gcd(const Fraction, const Fraction);
	int getNum() const;
	int getDen() const;
private:
	int numer;
	int denom;
};
#endif

