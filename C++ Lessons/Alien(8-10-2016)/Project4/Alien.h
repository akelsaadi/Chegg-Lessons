#ifndef ALIEN_H
#define ALIEN_H

class Alien
{
public:
	Alien();
	Alien(int h, int w, char g);
	virtual ~Alien();

	void setHeight(int h);
	void setWeight(int w);
	void setGender(char g);

	int getHeight();
	int getWeight();
	char getGender();

	//operators: compare the aliens
	bool operator == (const Alien& alien) const;
	bool operator != (const Alien& alien) const;
	bool operator <= (const Alien& alien) const;
	bool operator < (const Alien& alien) const;
	bool operator >= (const Alien& alien) const;
	bool operator > (const Alien& alien) const;

private:
	int height; //inches
	int weight; //pounds
	char gender; //M or F

};
#endif