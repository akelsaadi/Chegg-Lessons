#include <iostream>
using namespace std;

int main()
{

	int val = 0;
	cout << "Input: ";
	cin >> val;
	cout << "Output: " << endl;
	for (int i = 1; i <= val; i++)
	{
		for (int j = 1; j <= val; j++)
		{
			cout << 0;
		}
		cout << endl;
	}
	system("pause");
	return 0;
}