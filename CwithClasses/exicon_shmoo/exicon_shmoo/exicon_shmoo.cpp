#include <iostream>
#include <bitset>
#include <string>

using namespace std;

int main(){

	unsigned int testResult[] = { 0xFFFFFFFF, 0xFFFFFFFF, 0xFFF00007, 0xFFC00007, 0xFF800003, 0xFFE00001, 0xFFE0000F, 0xFFFF81FF, 0xFFFFFFFF };
	string resultBinary = "";

	for (int i = 0; i < sizeof(testResult) / sizeof(unsigned int); i++) {

		resultBinary = (bitset<32>(testResult[i])).to_string();
		reverse(resultBinary.begin(), resultBinary.end());
 		cout << dec << i + 12 << "ns " << hex << uppercase<< testResult[i] << " : ";
		
		for (int j = 0; j < resultBinary.length(); j++) {
			if (resultBinary.at(j) == '1')
				cout << "F";
			else
				cout << ".";
		}
		cout << endl;
	}

	return 0;
}
