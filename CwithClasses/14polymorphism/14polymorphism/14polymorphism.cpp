#include <iostream>

using namespace std;

class Car {
public:
    Car() {}
    //void sound() { cout << "붕붕" << endl; }
    virtual void sound() { cout << "붕붕" << endl; } //
    //virtual void sound() = 0; //이것이 순수 가상함수
};

class Mustang : public Car {
public:
    Mustang() {}
    void sound() { cout << "부아아아아ㅏ아앙" << endl; }
};

class ElectronicCar : public Car {
public:
    ElectronicCar() {}
    void sound() { cout << "웅" << endl; }
};

int main() {

    Car* carArray[3];

    carArray[0] = new Car();
    carArray[1] = new Mustang();
    carArray[2] = new ElectronicCar();

    carArray[0]->sound();
    carArray[1]->sound();
    carArray[2]->sound();

    ///다운캐스팅
    /*Car* mCar = new Mustang();
    Mustang* dreamCar = static_cast<Mustang*>(mCar);
    dreamCar->sound();*/

    return 0;
}