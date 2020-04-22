//#include "pch.h"
//#include <iostream>
//using namespace std;
//
//const double PI = 3.141592;
//
//struct C2dType { //2차원 자표 구조체
//
//	double x;
//	double y;
//};
//
//struct Circletype { //원 구조체
//
//	C2dType center; //중심 좌표
//	double radius; //반경
//};
//
//double circleArea(Circletype c) {
//
//	return c.radius * c.radius * PI;
//}
//
//bool chkOverlap(Circletype c1, Circletype c2) {
//
//	double dx = c1.center.x - c2.center.x;
//	double dy = c1.center.y - c2.center.y;
//	double dCntr = sqrt(dx*dx + dy*dy); //루트
//	
//	return dCntr < c1.radius + c2.radius;
//}
//
//void dispCircle(Circletype c) {
//
//	cout << " Center : (" << c.center.x << ", " << c.center.y << ")";
//	cout << " Radius : " << c.radius << endl;
//}
//int main()
//{
//	cout << "이것은 구조체 \n";
//	cout << "구조체는 값타입, 클래스는 참조타입. \n";
//	cout << "구조체는 메모리에 직접 접근하기에 클래스사용시 참조로 인한 비용낭비를 없애기 위해 사용한다. \n" << endl;
//
//	Circletype c1 = {{0, 0}, 10};
//	Circletype c2 = {{30, 10}, 5};
//
//	cout << "원1" << endl;
//	dispCircle(c1);
//	cout << "원1의 면적" << circleArea(c1) << "\n" << endl;
//
//	cout << "원2" << endl;
//	dispCircle(c2);
//	cout << "원2의 면적" << circleArea(c2) << "\n" << endl;
//
//	//두 원의 중첩 여부
//
//	if (chkOverlap(c1, c2))
//		cout << "두 원은 중첩됩니다." << endl;
//	else
//		cout << "두 원은 중첩되지 않습니다." << endl;
//	
//	return 0;
//}

#include "pch.h"
#include <iostream>
using namespace std;

const double PI = 3.141592;

struct C2dType { //2차원 자표 구조체

	double x;
	double y;
};

class CircleClass { //원 클래스

	C2dType center; //중심 좌표
	double radius; //반경

public:
	void init(double cx, double cy, double r) {

		center.x = cx;
		center.y = cy;
		radius = r;
	}

	double area() const {

		return radius * radius * PI;
	}

	bool chkOverlap(const CircleClass& c) const {

		double dx = center.x - c.center.x;
		double dy = center.y - c.center.y;
		double dCntr = sqrt(dx*dx + dy*dy); //루트

		return dCntr < radius + c.radius;
	}

	void display() const {

		cout << " Center : (" << center.x << ", " << center.y << ")";
		cout << " Radius : " << radius << endl;
	}
};

int main()
{
	cout << "이것은 클래스 \n";
	cout << "구조체는 값타입, 클래스는 참조타입. \n";
	cout << "구조체는 메모리에 직접 접근하기에 클래스사용시 참조로 인한 비용낭비를 없애기 위해 사용한다. \n" << endl;

	CircleClass c1, c2;
	c1.init(0, 0, 10);
	c2.init(30, 10, 5);


	cout << "원1" << endl;
	c1.display();
	cout << "원1의 면적" << c1.area() << "\n" << endl;

	cout << "원2" << endl;
	c2.display();
	cout << "원2의 면적" << c2.area() << "\n" << endl;

	//두 원의 중첩 여부

	if (c1.chkOverlap(c2))
		cout << "두 원은 중첩됩니다." << endl;
	else
		cout << "두 원은 중첩되지 않습니다." << endl;

	return 0;
}

