/*
* MyString.cpp
*
*  Created on: Apr 6, 2015
*      Author: cong
*/

#include "MyString.h"
#include <string.h>
#include <iostream>

using namespace std;

MyString::MyString() :m_data(NULL) {}

MyString::MyString(const char* ptr)
{
	if (ptr == NULL) {
		m_data = new char[1];
		*m_data = '\0';
	}
	else {
		int len = strlen(ptr);
		m_data = new char[len + 1];
		strcpy(m_data, ptr);
	}
}

MyString::MyString(const MyString &src)
{
	int len = strlen(src.m_data);
	m_data = new char[len + 1];
	strcpy(m_data, src.m_data);
}

MyString::~MyString()
{
	if (m_data != NULL) {
		delete[] m_data;
	}
}

bool MyString::operator==(const MyString &src)
{
	if (!strcmp(m_data, src.m_data)) {
		return true;
	}
	else {
		return false;
	}
}

MyString& MyString::operator=(const MyString &src)
{
	if (this != &src) {
		delete[] m_data;
		m_data = new char[strlen(src.m_data) + 1];
		strcpy(m_data, src.m_data);
	}

	return *this;
}

MyString MyString::operator+(const MyString &src)
{
	MyString newString;
	if (!src.m_data) {
		newString = *this;
	}
	else if (!m_data) {
		newString = src;
	}
	else {
		newString.m_data = new char[strlen(m_data) + strlen(src.m_data) + 1];
		strcpy(newString.m_data, m_data);
		strcat(newString.m_data, src.m_data);
	}

	return newString;
}

char MyString::operator [](unsigned int index)
{
	return m_data[index];
}

ostream& operator<<(ostream &output, const MyString &src)
{
	output << src.m_data;
	return output;
}

istream& operator>>(istream &input, MyString &src)
{
	int numOfChars;
	cout << "Please input the characters number" << endl;
	cin >> numOfChars;
	if (src.m_data != NULL) {
		delete[] src.m_data;
	}
	src.m_data = new char[numOfChars + 1];
	cout << "Please input the characters" << endl;
	cin >> src.m_data;

	return input;
}