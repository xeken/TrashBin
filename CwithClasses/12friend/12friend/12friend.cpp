#include <iostream>

using namespace std;

class Bully;

class TheMan {

private:
	int money;

public:
	friend Bully;
	TheMan() { this->money = 30000; }
	void print() { cout << "TheMan이 현재 가지고 있는 돈" << money << endl; }
};


class Bully {

private:
	int money;

public:
	Bully() { this->money = 0; }
	void print() { cout << "Bully가 현재 가지고 있는 돈" << money << endl; }
	void SomethinBad(TheMan& theMan) {
		this->money += theMan.money;
		theMan.money = 0;
	}
};


int main() {

	TheMan theMan;
	Bully bully;

	theMan.print();
	bully.print();

	cout << "-----------나쁜 짓-------------" << endl;
	bully.SomethinBad(theMan);

	theMan.print();
	bully.print();

	cout << endl;
	return 0;

}



