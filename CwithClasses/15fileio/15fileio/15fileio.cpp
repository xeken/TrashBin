#include <iostream>
#include <fstream>

using namespace std;

int main() {


    /////@todo  이진파일 자료 차ㅓㅁ고
    //struct Score { int number; char name[30]; int score; } grades[] = {
    // { 20100001, "홍길동", 100 },
    // { 20100002, "젠틀맨", 35 },
    // { 20100003, "임기공", 70 },
    //};

    //ofstream os;
    //os.open("test.dat", ofstream::binary);
    //if (os.fail()){
    // cerr << "파일오픈 실패" << endl;
    // exit(1);
    //}
    //os.write((char*)&grades, sizeof(grades));
    //os.close();


    //3번 복사붙여넣기
    //ifstream is;
    //ofstream os;

    //is.open("ReadMe.txt");

    //if (is.fail()){
    // cerr << "파일 오픈 실패" << endl;
    // exit(1);
    //}

    //os.open("result.txt");
    //if (os.fail()){
    // cerr << "파일 오픈 실패" << endl;
    // exit(1);
    //}

    //char c;
    //is.get(c);
    //while (!is.eof()){
    // os << c;
    // is.get(c);
    //}
    //is.close();
    //os.close();

    //라인앞에 숫자달기
    //ifstream is;
    //ofstream os;

    //is.open("ReadMe.txt");
    //
    //if(is.fail()){
    // cerr << "파일 오픈 실패" << endl;
    // exit(1);
    //}

    //os.open("result.txt");
    //if (os.fail()){
    // cerr << "파일 오픈 실패" << endl;
    // exit(1);
    //}

    //char c;
    //int lineNumber = 1;

    //is.get(c);
    //os << lineNumber << "; ";
    //
    //while (!is.eof()){
    // os << c;
    // if (c == '\n'){
    //  lineNumber++;
    //  os << lineNumber << ": ";
    // }
    // is.get(c);
    //}
    //is.close();
    //os.close();


    ///////////2번
    //ofstream os;
    //char c;
    //os.open("result.txt");

    //while (cin.get(c))
    // os.put(c);
    //
    //os.close();


    ///////////1번
    //ifstream is;
    //is.open("score.txt");
    // 
    //if (!is){
    // cerr << "파일 오픈 실패" << endl;
    // exit(1);
    //}

    //int number;
    //char name[30];
    //int score;

    //is >> number >> name >> score;

    ////읽기/////////////////////////쓰기//

    //ofstream os;
    //os.open("result.txt");
    //os << number << "" << name << "" << score << endl;

    //is.close();
    //os.close();

    return 0;
}



