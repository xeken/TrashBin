// SecondStep.cpp : 이 파일에는 'main' 함수가 포함됩니다. 거기서 프로그램 실행이 시작되고 종료됩니다.
//

#include "pch.h"
#include <iostream>
using namespace std;


int main()
{
	/*float radius;
	const float PI = 3.141592;
	cout << "반지름 입력(cm) : ";
	cin >> radius;

	double result = radius * radius * PI;

	cout << result << "cm^2" << endl;*/

	int n = 10, m = 3;
	float cast = (static_cast<float> (n) / m) * 2;
	float nCast = n / m * 2;
	cout << "cast : " << cast << " not Cast : " << nCast << endl;


	int val, total = 0;
	cin >> val;
	while (val > 0) {
		total += val;
		cin >> val;
	}
	cout << "val을 입력받는데 0보다 크면 계속 루프를 돈다. total : " << total << endl;

}

