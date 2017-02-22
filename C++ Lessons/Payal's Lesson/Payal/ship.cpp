#include <string>
#include <iostream>

using namespace std;


class Ship
{
	
private:
	string name;
	int year;

public:
	Ship();
	Ship(string newName, int newYear);
	string getName();
	int getYear();
	void print();
	void setName(string newName);
	void setYear(int newYear);
};

Ship::Ship()
{

}

Ship::Ship(string newName, int newYear)
{
	
	name = newName;
	year = newYear;
}

string Ship::getName()
{
	
	return name;
}

int Ship::getYear()
{
	
	return year;
}

void Ship::setName(string newName)
{
	name = newName;
}

void Ship::setYear(int newYear)
{
	//Setting year
	year = newYear;
}

void Ship::print()
{
	cout << "Ship Name: " << name << endl;
	cout << "Built: " << year << endl;
	cout << endl;
}

class CruiseShip : public Ship
{
private:
	int capacity;

public:
	CruiseShip();
	CruiseShip(string newName, int newYear, int newCapacity);
	int getCapacity();
	void setCapacity(int newCapacity);
	void print();
};

CruiseShip::CruiseShip() : Ship()
{

}

CruiseShip::CruiseShip(string newName, int newYear, int newCapacity) : Ship(newName, newYear)
{
	capacity = newCapacity;
}

int CruiseShip::getCapacity()
{
	return capacity;
}

void CruiseShip::setCapacity(int newCapacity)
{
	capacity = newCapacity;
}

void CruiseShip::print()
{
	cout << "CruiseShip Name: " << getName() << endl;
	cout << "Capacity of Cruise Ship - Number of Passengers: " << capacity << " Persons" << endl;
	cout << endl;
}

class CargoShip : public Ship
{
private:
	int capacity;

public:
	CargoShip();
	CargoShip(string newName, int newYear, int newCapacity);
	int getCapacity();
	void setCapacity(int newCapacity);
	void print();
};

CargoShip::CargoShip()
{

}

CargoShip::CargoShip(string newName, int newYear, int newCapacity) : Ship(newName, newYear)
{
	capacity = newCapacity;
}

int CargoShip::getCapacity()
{
	return capacity;
}

void CargoShip::setCapacity(int newCapacity)
{
	capacity = newCapacity;
}

void CargoShip::print()
{
	cout << "CargoShip Name: " << getName() << endl;
	cout << "Capacity of Cargo Ship-Tonnage: " << capacity << " Tons" << endl;
	cout << endl;
}

int main()
{
	cout << "INPUT:" << endl;

	string name;
	int year;
	int capacity;

	cout << "Enter the Name of the Ship: ";
	cin >> name;
	cout << "Enter the year the Ship was built: ";
	cin >> year;

	Ship conShip = Ship(name, year);
	Ship mutShip;
	mutShip.setName(name);
	mutShip.setYear(year);

	cout << "\nEnter the Name of the CruiseShip: ";
	cin >> name;
	cout << "Enter the year the CruiseShip was built: ";
	cin >> year;
	cout << "Enter the capacity of the Cruise Ship (in persons): ";
	cin >> capacity;

	CruiseShip conCruise = CruiseShip(name, year, capacity);
	CruiseShip mutCruise;
	mutCruise.setName(name);
	mutCruise.setYear(year);
	mutCruise.setCapacity(capacity);

	cout << "\nEnter the Name of the CargoShip: ";
	cin >> name;
	cout << "Enter the year the CargoShip was built: ";
	cin >> year;
	cout << "Enter the capacity of the Cargo Ship (in tonnage): ";
	cin >> capacity;

	CargoShip conCargo = CargoShip(name, year, capacity);
	CargoShip mutCargo;
	mutCargo.setName(name);
	mutCargo.setYear(year);
	mutCargo.setCapacity(capacity);

	cout << "\nOUTPUT:" << endl;
	cout << "Now printing the Objects created using constructor with arguments: " << endl;;
	conShip.print();
	conCruise.print();
	conCargo.print();

	cout << "Now printing the Objects created using default constructor and mutators: " << endl;
	mutShip.print();
	mutCruise.print();
	mutCargo.print();

	system("pause");
	//End of program
	return 0;
}