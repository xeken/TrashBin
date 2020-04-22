#include "pch.h"
#include <iostream>
using namespace std;

int main()
{

	float FahrToC(float fahr); //이렇게 안하면 함수를 메인 위에 선언해야합니다
	void FahrToC_Ref(float &fahr);

	float temp;
	cin >> temp;
	cout << "C : " << FahrToC(temp) << endl;
	cout << "현재 temp : " << temp << endl;
	
	float &rTemp = temp;
	FahrToC_Ref(rTemp);
	cout << "참조호출후 temp : " << temp << endl;

	return 0;
}

float FahrToC(float fahr) {

	return (fahr - 32) * 5 / 9;
}


void FahrToC_Ref(float &fahr) {

	fahr =  (fahr - 32) * 5 / 9;
}
