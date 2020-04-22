/**
* @file regex
* @brief 정규표현식\n
* 예제
* @author 조병현 (bhcho@exicon.co.kr)
*/
#include <iostream>
#include <regex>

using namespace std;

// @이메일 찾아내기
void ex1() {

    string input = R"(
Name :ByungHyen Jo
Email1: xeken@naver.com
Email2: bhcho@exicon.co.kr
Phone: 010-1111-3414

=============================
 )";

    regex regex_r("[\\w+.-]+@([\\w+.-]+\\.)+\\w{2,4}");

    sregex_iterator iterator(input.begin(), input.end(), regex_r);
    sregex_iterator end;

    string print = "";

    for (iterator; iterator != end; iterator++)
        print.append((*iterator).str() + "\n");

    cout << input << endl;
    cout << print << endl;

}

//@regex_search
void ex2() {

    string input = "This is unnecessary thing, So uncomfortable.";
    regex regex_r("un[a-z]*");
    smatch output;

    while (regex_search(input, output, regex_r)) {
        cout << output.str() << endl;
        input = output.suffix(); //검색된 곳 까지 자르기
    }

}

//@regex_replace() $
void ex3() {

    string input = "I was sitting in an extremely uncomfortable position";
    regex regex_r("\\b(un)(\\w*)");

    string output = "";
    output = regex_replace(input, regex_r, "[$1] --- [$2]");  //$는 (괄호)로 묶인 그룹의 번호
    cout << output << endl;

    output = "";
    regex_replace(back_inserter(output), input.begin(), input.end(), regex_r, "[$1] --- [$2]");
    cout << output << endl;

    output = regex_replace(input, regex_r, "[$1] --- [$2]", regex_constants::format_no_copy);
    cout << output << endl;

}


//@regex_replace()
void ex4() {

    string input = "Hello, Hello, There is cloud.";
    regex regex_r("\\b(\\w)*,[^]");
    cout << regex_replace(input, regex_r, "Bye, ") << endl;

}

int main() {

    //printf("\n");
    //ex1();
    //ex2();
    ex3();
    //ex4();
    return 0;
}


/*
void questionMarker(string input);
void asteriskMarker(string input);
void plusMarker(string input);
void check(string input);
void print();

int _tmain(int argc, _TCHAR* argv[])
{

 cout << "매칭: 010-[0-9]{4}-[0-9]{4}" << endl;
 string input = "";
 cout << "input: ";
 getline(cin, input);
 //qqq(input);
 //questionMarker(input);
 //asteriskMarker(input);
 //plusMarker(input);

 //cout << "[패턴]{n}은 n번 만큼 일치시킨다. \n\n[패턴]{min,}은 min번 이상 일치시킨다. \n\n[패턴]{min,max}는 min번 이상, max번 이하 일치시킨다.\n" << endl;

 check(input);
 //print();
 return 0;
}


void questionMarker(string input){

 regex regex_r("l?emon");

 if (regex_match(input, regex_r))
  cout << "TRUE" << endl;
 else
  cout << "FALSE" << endl;

}

void asteriskMarker(string input){

 regex regex_r("l*emon");

 if (regex_match(input, regex_r))
  cout << "TRUE" << endl;
 else
  cout << "FALSE" << endl;
}

void plusMarker(string input){

 regex regex_r("l+emon");

 if (regex_match(input, regex_r))
  cout << "TRUE" << endl;
 else
  cout << "FALSE" << endl;
}

void check(string input){

 //string html = R"(<h1> aa </h1>
 //    <div id='hi'> something </div>
 //    <div> dididi </div>)";
 //regex regex("(<div id='hi')([\\w])(</div>)");

 //sregex_iterator iterator(html.begin(), html.end(), regex);
 //sregex_iterator end;
 //string print = "";


 //regex regex_r("010-\\d{4}-\\d{4}");

 //if (regex_match(input, regex_r))
 // cout << "THIS IS PHONE NUMBER";
 //else
 // cout << "IS NOT";

 regex regex_r("010-[0-9]{4}-[0-9]{4}");

 if (regex_match(input, regex_r))
  cout << "THIS IS PHONE NUMBER";
 else
  cout << "IS NOT";

 //string phone = "033-234-4567";
 //regex phone_r("\\d{2,3}-\\d{3,4}-\\d{4}");

 //if (regex_match(phone, phone_r))
 // cout << phone << endl;
 //else
 // cout << "asdasd" << endl;
 printf("\n");
}

void print(){

 string input = "852Man3,G2IRL1";
 regex regex("[^0-9]"); //[A-Za-z,]

 sregex_iterator iterator(input.begin(), input.end(), regex);
 sregex_iterator end;

 string print = "";

 while (iterator != end){

  smatch match = *iterator;
  print.append(match.str(0).c_str());

  iterator++;
 }
 cout << print;

}
//{
//
// *특정한 규칙을 가진 문자열의 집합을 표현할 때, 사용되는 <형식언어>.
// *검색엔진, 워드프로세서의 찾기, 바꾸기 등에 사용됨.
// *우리가 사용하는 c++와 Python은 표준 라이브러리를 통해 제공됨.
//
// 1.스티븐 클레이니(수학자)가 <정규언어>를 기술한 것이 기원.
// 2.유닉스의 Vi, awk, Emacs에 포함됨.
// 3.조금 더 강력한 정규표현식이 펄에 등장.
// 4.POSIX.2(Portable Operating System Interface)에 표준화.
// 5.Java, Python, .Net Framework등에 펄의 정규표현식 문법 채택 => [0-9] = \d
//
//
//
// <형식언어> : 특정한 법칙들에 따라 구성된 문자열들의 집합.
// <정규언어> : 형식언어이론에서 정규표현식을 사용하여 표현할 수 있는 형식 언어
//}

//


*/