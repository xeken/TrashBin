#include <iostream>

using namespace std;

class Vector
{
private:
	double x, y;

public:
	Vector(double x, double y) : x(x), y(y) {};
	void print() {
		cout << "(" << x << ", " << y << ")" << endl;
	}
	Vector operator+(Vector& v2) {
		Vector v(0.0, 0.0);
		v.x = this->x + v2.x;
		v.y = this->y + v2.y;

		return v;
	}
};


int main() {

	Vector v1(1.0, 2.0);
	Vector v2(3.5, 4.5);

	Vector v3 = v1 + v2;

	v3.print();

	return 0;
}



