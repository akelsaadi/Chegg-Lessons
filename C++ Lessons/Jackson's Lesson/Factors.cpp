#include <iostream>
using namespace std;

int main()
{
	
	
	int val = 0;
	cout << "Input: ";
	cin >> val;
	cout << "Output: "; 
	for (int i = val; i >= 1; i--)
	{
		if (val % i == 0)
		{
			cout << i << endl;
		}
	}



	system("pause");
	return 0;

}