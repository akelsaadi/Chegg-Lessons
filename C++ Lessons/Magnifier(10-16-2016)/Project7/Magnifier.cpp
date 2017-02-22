#include <iostream>
using namespace std;

void banner();
char choice();
void digit0();
void digit1();
void digit2();
void digit3();
void digit4();
void digit5();
void digit6();
void digit7();
void digit8();
void digit9();
char digit;

int main()

{
	

	banner();
	do {
		switch (choice())
		{

		case '0':
			digit0();
			break;
		case '1':
			digit1();
			break;
		case '2':
			digit2();
			break;
		case '3':
			digit3();
			break;
		case '4':
			digit4();
			break;
		case '5':
			digit5();
			break;
		case '6':
			digit6();
			break;
		case '7':
			digit7();
			break;
		case '8':
			digit8();
			break;
		case '9':
			digit9();
			break;
		case 'X':
			cout << "Now exiting" << endl;
			break;
		default:
			cout << "I haven't figured that out yet" << endl;
			break;
		}
	} while (digit != 'X');
	
	system("pause");
	return 0;
	
}


void banner()
{
	cout << "Number Magnifier!" << endl;
	cout << "See the number up close, and personal!" << endl;

}

 char choice()
{
	
	cout << "Enter a digit (0-9) or press X to exit: " << endl;
	digit = cin.get();
	cin.ignore(256, '\n');
	return digit;
}

void digit0()
{
	cout << "  000  " << endl;
	cout << " 0   0 " << endl;
	cout << " 0   0 " << endl;					
	cout << " 0   0 " << endl;
	cout << " 0   0 " << endl;
	cout << " 0   0 " << endl;
	cout << "  000  " << endl;
}
void digit1()
{
	cout << "  1  " << endl;
	cout << "  1  " << endl;
	cout << "  1  " << endl;
	cout << "  1  " << endl;
	cout << "  1  " << endl;
	cout << "  1  " << endl;
	cout << "  1  " << endl;
	cout << "  1  " << endl;
}
void digit2()
{
	cout << "  222  " << endl;
	cout << " 2   2 " << endl;
	cout << "    2  " << endl;
	cout << "   2   " << endl;
	cout << "  2    " << endl;
	cout << " 2     " << endl;
	cout << " 22222 " << endl;
}
void digit3()
{
	cout << " 333 " << endl;
	cout << "3   3" << endl;
	cout << "   3 " << endl;
	cout << " 33  " << endl;
	cout << "   3 " << endl;
	cout << "3   3" << endl;
	cout << " 333 " << endl;
}
void digit4()
{
	cout << "   4   " << endl;
	cout << "  44   " << endl;
	cout << " 4 4   " << endl;
	cout << "444444 " << endl;
	cout << "   4   " << endl;
	cout << "   4   " << endl;
	cout << "   4   " << endl;
}
void digit5()
{
	cout << " 555555 " << endl;
	cout << " 55     " << endl;
	cout << " 555555  " << endl;									       
	cout << "     55  " << endl;
	cout << " 555555  " << endl;
}
void digit6()
{
	cout << "   666 " << endl;
	cout << "  6    " << endl;
	cout << " 6     " << endl;
	cout << " 6666  " << endl;
	cout << " 6   6 " << endl;
	cout << " 6   6 " << endl;
	cout << "  666  " << endl;
}
void digit7()
{
	cout << " 77777 " << endl;
	cout << "     7" << endl;
	cout << "    7  " << endl;
	cout << "   7   " << endl;
	cout << "  7    " << endl;
	cout << " 7     " << endl;
}
void digit8()
{
	cout << "  888  " << endl;
	cout << " 8   8 " << endl;
	cout << "  8 8  " << endl;
	cout << "   8   " << endl;
	cout << "  8 8  " << endl;
	cout << " 8   8 " << endl;
	cout << "  888  " << endl;
}
void digit9()
{
	cout << "  999  " << endl;
	cout << " 9   9 " << endl;
	cout << " 9   9 " << endl;
	cout << "  9999 " << endl;
	cout << "     9 " << endl;
	cout << "     9 " << endl;
	cout << "  999  " << endl;
}