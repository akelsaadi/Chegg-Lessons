/*
* main.cpp
*
*  Created on: Apr 6, 2015
*      Author: cong
*/

#include <iostream>
#include "MyString.h"

int main()
{
	const char *p = "Hello world!";
	MyString s0 = "Bye world";
	MyString s1(p);
	MyString s2 = s1;
	MyString s3;
	s3 = s1;
	MyString s4 = s3 + s1;
	bool flag(s1 == s2);
	cout << s0 << endl;
	cout << s1 << endl;
	cout << s2 << endl;
	cout << s3 << endl;
	cout << s4 << endl;
	cout << flag << endl;
	char result = s2[1];
	cout << result << endl;
	cin >> s4;
	cout << s4 << endl;

	return 0;
}