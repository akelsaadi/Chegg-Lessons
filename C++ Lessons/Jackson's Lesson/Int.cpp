#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main()
{
	int val = 0;
	int arr[99];
	val = 0;
	int i = 0;
	cout << "Input: ";
	while (val != -1)
	{
		
		cin >> val;
		arr[i] = val;
		i++;
	}
	cout << "Output:" << endl;
	for (int j = 0; j < i-1; j++)
	{
		cout <<	arr[j] << endl;
	}
	system("pause");
	return 0;
}