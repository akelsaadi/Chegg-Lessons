#include <cstdlib>
#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>
#include <sstream>

using namespace std;

// define a data structure
struct InventoryRecord
{
	string name;// inventory item name
	int itemNum; // item number
	int qty;       // how many are in stock
	double cost; // the cost
	int safestock; // number of safe stock
	double priceqt; // price*quantity
	double percStock; // % of stock
	char flag; // putting a char in the flag if low
};

int main()
{
	
	string str;
	string str1;
	string str2;
	string str3;
	string str4;
	string str5;
	int holder1;
	int holder2;
	double holder3;
	int holder4;
	int i = 0;
	int total = 0;
	double priceqt;

	InventoryRecord inv[60];
	ifstream in("invt.txt");
	while (getline(in, str)) {
		//store file  line by line into strings
		//splitting up strings based on number of chars
		str1 = str.substr(0, 20 ); 
		str2 = str.substr(24,5);
		str3 = str.substr(34, 3);
		str4 = str.substr(39, 6);
		str5 = str.substr(49, 3);
		// converting accordingly
		holder1 = atoi(str2.c_str());
		holder2 = atoi(str3.c_str());
		holder3 = atof(str4.c_str());
		holder4 = atoi(str5.c_str());
		//adding them to the inventory struct accordingly
		inv[i].name = str1; 
		inv[i].itemNum = holder1;
		inv[i].qty = holder2;
		inv[i].cost = holder3;
		inv[i].safestock = holder4;
		inv[i].priceqt = inv[i].qty*inv[i].cost;
		total += inv[i].priceqt;
		if (inv[i].qty < inv[i].safestock)
			inv[i].flag = 'X';
		else inv[i].flag = ' ';

		i++;
	}
	//Sorting based on itemNumber
	InventoryRecord temp; 
	for (int k = 0; k <17; k++)
	{
		for (int j = 0; j < 17 - k; j++)
		{
			if (inv[j].itemNum>inv[j + 1].itemNum)
			{
				temp = inv[j];
				inv[j] = inv[j+1];
				inv[j+1] = temp;
			}
		}
		
	}
	//printing out to file and formatting
	ofstream ofs("Report.txt");
	ofs << "item number" << "         " << "item name" << "                 " << "quantity" << "	       " << "price" << "        "<< "price*quantity" <<  "     " << "flag" << endl;
	for (int d = 0; d < 17; d++)
	{
		ofs << inv[d].itemNum << "\t\t" << inv[d].name << "\t\t" << inv[d].qty << "\t\t" << inv[d].cost << "\t\t" << inv[d].priceqt << "\t\t" << inv[d].flag << endl;
	}
	

	cout << "DONE" << endl;
	system("pause");
	return 0;

	

}


