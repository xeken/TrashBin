#include "pch.h"
#include <iostream>
using namespace std;

int main()
{

	char str[14] = "Hello, world!";
	char *ptr;

	cout << str << endl;
	ptr = str; // == char *ptr = str;

	while (*ptr) {
		if (*ptr >= 'a' && *ptr <= 'z')
			*ptr = *ptr - 'a' + 'A';
		ptr++;
	}
	cout << str << endl;

	delete[] ptr;
	ptr = NULL;

	return 0;
}
