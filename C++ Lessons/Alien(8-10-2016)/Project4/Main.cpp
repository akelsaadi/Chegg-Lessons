#include <iostream>
using namespace std;
#include "Alien.h"

int main()
{
	//instantiating alien objects
	Alien a1;
	Alien female(501, 20, 'F');
	Alien male(300, 50, 'M');

	//testing all six overloaded operators
	if (male != female)
		cout << "This is not a fair fight!" << endl;

	if (male <= female)
		cout << "Either the female wins, or it could be a draw!" << endl;

	if (male < female)
		cout << "The female wins!" << endl;

	if (male >= female)
		cout << "Either the male wins, or it could be a draw!" << endl;

	if (male > female)
		cout << "The male wins!" << endl;

	if (male == female)
		cout << "It's a draw!" << endl;

	getchar();

	return 0;
}//end main
