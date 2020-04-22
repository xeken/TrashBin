// FirstStep.cpp : 이 파일에는 'main' 함수가 포함됩니다. 거기서 프로그램 실행이 시작되고 종료됩니다.
//

#include "pch.h"
#include <iostream>
using namespace std;
namespace myNSp1 { int n = 10; }
namespace myNSp2 { int n = 20; }
int n = 30;

int main()
{
	cout << "Fisrt STEP은 프린트문이네요" << endl;

	cout << "2번째는 네임스페이스 장난이네요" << endl;
	int n = 40;
	cout << myNSp1::n << "<= 이것은 myNSp1" << endl;
	cout << myNSp2::n << "<= 이것은 myNSp2" << endl;
	cout << ::n << "<= 이것은 메인 네임ㅁ스페이스여?" << endl;
	cout << n << "<= 이것은 메인이여" << endl;
	
	int abc = 0;
	cout << "숫자를 입력하세요 : " << endl;
	cin >> abc;
	cout << "입력 받은 수 : " << abc << endl;
	return 0;
}

