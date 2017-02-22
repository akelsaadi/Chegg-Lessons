#include "vector.h"
#include <iostream>
#include <utility>

using namespace std;

Vector::Vector()
{
	for (int i = 0; i < size; i++)
	{
		entries[i] = 0;
	}
}
Vector::Vector(int length) 
{
	size = length;
 	entries = new int[size];
	for (int i = 0; i < size; i++)
		entries[i] = 0.0;
}


Vector::~Vector()
{
	delete[] entries;
}




Vector::Vector(const Vector & other) 
{
	size = other.size;
	entries = new int [size];
	for (int i = 0; i < size; i++)
		entries[i] = other.entries[i];
}

Vector Vector::operator=(const Vector &vector) 
{
	
		for (int i = 0; i < size; i++)
			entries[i] = vector.entries[i];
		return *this;
	
}

int& Vector::operator[](int i)
{
	return entries[i];
}
Vector Vector::operator+(const Vector& otherVector) const
{
	Vector v(size);
	for (int i = 0; i<size; i++)
	{
		v[i] = entries[i] + otherVector.entries[i];
	}
	return v;
}


void Vector::get()
{
	for (int i = 0; i < size; i++)
	{
		cout << "Enter vector at index " << i << ": " ;
		cin >> entries[i];

	}
		
}



void Vector::print()
{
	cout << "[";
	for (int i = 0; i < size; i++)
		cout << entries[i] << " " ;
	cout << "]";
	cout << endl;
}