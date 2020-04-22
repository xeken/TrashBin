
#include <iostream>
#include <fstream>

using namespace std;

template<typename T1>
class Container {
private:
    T1 data;
public:
    T1 getData() { return this->data; }
    void setData(T1 data) { this->data = data; }
};

int main() {

    Container<int>* c1 = new Container<int>;
    c1->setData(123456);
    cout << c1->getData() << endl;

    return 0;
}

//int main(){
//
// cout << getMax(12, 52) << endl;
// cout << getMax(1.31, 3.14) << endl;
// cout << getMax('A', 'a') << endl;
// return 0;
//}


//
//double getMax(double a, double b){
//
// if (a > b) return a;
// return b;
//}
//int getMax(int a, int b){
//
// if (a > b) return a;
// return b;
//}
//char getMax(char a, char b){
//
// if (a > b) return a;
// return b;
//}

//template <typename T>
//T getMax(T a, T b){
//
// if (a > b) return a;
// return b;
//}

