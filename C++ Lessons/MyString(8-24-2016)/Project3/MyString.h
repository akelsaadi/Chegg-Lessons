/*
* MyString.h
*
*  Created on: Apr 6, 2015
*      Author: cong
*/

#ifndef MYSTRING_H_
#define MYSTRING_H_

#include <iostream>

using namespace std;

class MyString {
public:
	MyString();
	MyString(const char* ptr);
	MyString(const MyString& src);
	~MyString();
	MyString& operator=(const MyString& src);
	MyString  operator+(const MyString& src);
	char operator[](const unsigned int index);
	bool operator==(const MyString& src);
	friend ostream& operator<<(ostream &output, const MyString &src);
	friend istream& operator>>(istream &input, MyString &src);

private:
	char *m_data;
};

#endif /* MYSTRING_H_ */