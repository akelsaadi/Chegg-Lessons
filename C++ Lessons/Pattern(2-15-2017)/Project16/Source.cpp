#include <iostream>
#include <iomanip>
using namespace std;
void displayPattern(int n)
{
	int i, j;
	for (i = 1; i <= n; i++) {
		cout << setw(3 * (n - i + 1)) << right << i;
		for (j = i - 1; j >= 1; j--) {
			cout << setw(3) << right << j;
		}
		cout << endl;
	}
}
int main()
{
	cout << " Enter a number ";
	int n;
	cin >> n;
	displayPattern(n);	
	system("pause");
	return 0;

}