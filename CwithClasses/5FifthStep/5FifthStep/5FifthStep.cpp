#include "pch.h"
#include <iostream>
using namespace std;

int main()
{
	
	int val1 = 10, val2 = 20;

	int *valPtr = &val1; //non-const 일반 포인터
	valPtr = &val2; //주소 변경 가능
	*valPtr = val1; //값 변경 가능

	cout << "포인터가 상수, 주소가 상수" << endl;
	int *const cValPtr = &val1; //const 상수 포인터, 주소에 대한 포인터
	//cValPtr = &val2; //포인터에 상수선언이 되어 주소 변경 불가
	*cValPtr = val2; //값은 const가 붙지 않아 값 변경 가능

	cout << "포인터가 가리키는 값이 상수, 값이 상수" << endl;
	const int *pcValptr = &val1; //상수에 대한 포인터(Pointer to Vonstant)
	pcValptr = &val2; //주소에는 상수선언이 안걸려서 주소 변경 가능
	//*pcValptr = val2 //값이 상수 선언되어 값 변경 불가

	cout << "포인터가 상수, 가리키는 값도 상수" <<endl;
	const int *const ccValPtr = &val1; //상수에 대한 상수포인터(Const Pointer to Constant)
	//ccValPtr = &val2; //주소가 상수선언되어 변경 불가
	//*ccValPtr = val2; //값이 상수선언되어 변경 불가
	
	return 0;
}

