#include "pch.h"
#include <iostream>
using namespace std;

struct customStruct {

	double x;
	double y;
};
int main()
{
	cout << "*는 '간접액세스 연산자'라고 부른다" << endl;

	int a = 10;
	int *ptr = &a;

	cout << "현재 a : " << a << ", *ptr : " << *ptr << endl; // ptr 앞의 *빼면 a의 주소를 보여준다.

	*ptr = 20;
	cout << "*ptr을 20으로 바꾸고 난 후 a : " << a << ", *ptr : " << *ptr << endl;

	a = 55;
	cout << "a를 55으로 바꾸고 난 후 a : " << a << ", *ptr : " << *ptr << endl;

	customStruct c1 = { 5,10 };
	customStruct *c2 = &c1;
	cout << "(*c2).x : " << (*c2).x << ", c2->x : " << c2->x << endl;
	cout << "(*c2).x : ()를 사용하는 이유는 .이 *보다 우선순위가 높아서. c2->x 를 사용하는 것이 일반적" << endl;

	return 0;
}

