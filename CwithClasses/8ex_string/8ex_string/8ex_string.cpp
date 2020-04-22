#include <iostream>
#include <vector>

#pragma warning(disable:4996)

using namespace std;

void e_strlen();
void e_strcmp();
void e_strcpy();
void e_strcat();
void e_sprintf();
void e_strchr();
void e_strstr();
void e_strtok();
void e_atoi();
void e_strtol();
void e_iterator(string str);
void strInfo(string str);

int main()
{

    string str = "6words 13word 21words";
    strInfo(str);

    str.resize(8);
    strInfo(str);
    str.resize(20, 'Q');
    strInfo(str);
    //str.shrink_to_fit(); //문자열 길이에 맞게 capacity를 맞춰준다. but, 자동으로 되는 듯 하오.
    str.clear(); //문자열의 값들 삭제, 메모리 해제가 아님
    strInfo(str);
    //str.reserve(3000); // 문자 3000개가 들어 갈 거니 capacity를 그만큼 할당해놔라, 근데 왜 안먹혀

    if (str.empty()) //str.size() == 0 보다 str.empty()가 더 성능 이 좋다.
        cout << "bim" << endl;

    str = "I love String";
    const char* c = str.c_str();

    e_iterator(str);

    //swap(str1, str2) // you know

    return 0;
}

// _s가 붙는 함수는 String Destination 버퍼를 넘어서는 메모리 복사를 방지하는 것, probable _s(afe)?
//c++의 string은 char문자열과 달리 끝에 NULL이 포함되지 않는다.
//포인터에 문자열이 들어가면 읽기전용이 됨, 동적메모리할당을 하면 쓰기가능

//int strlen(char *c)        
void e_strlen() {

    string e = "strlen: 문자열의 길이 STRing LENgth";

    char s1[] = "HELLO";

    int len = strlen(s1);

    cout << len << endl;
}

//int strcmp(char *c, char *d)       
void e_strcmp() {

    string e = "strcmp: 문자열 비교 STRing CoMPare, 전자가 크면 -1, 동일하면 0, 후자가 크면 1";

    char s1[] = "abc";
    char s2[] = "ABC";

    int result = strcmp(s1, s2);

    cout << result << endl;
}

//char *strcpy(char *c, char*d)        
void e_strcpy() {

    string e = "strcpy: 문자열 복사 STRing CoPY, 후자의 값을 전자로 복사";

    char s1[] = "";
    char s2[] = "HIHIHIHI";

    strcpy(s1, s2);

    cout << s1 << endl;
}

//char *strcat(char *c, char*d)      
void e_strcat() {

    string e = "strcat: 문자열 연결 STR conCATenate, 후자의 값을 전자에 이어 붙임";

    char s1[] = "붙여주세요.";
    char s2[] = "붙입니다.";

    strcat(s1, s2);

    cout << s1 << endl;

}
//int sprintf(char *c, 문자서식 %, 값들)     
void e_sprintf() {

    string e = "sprintf: 문자열 생성, 문자열에 다양한 서식들로 값을 추가";

    char s1[] = "";

    sprintf(s1, "%d %s %f", 20, "years", 1.9f);

    printf("%s", s1);

}

//char *strchr(char *c, int ASKII)
void e_strchr() {

    string e = "strchr: 문자열중 특정 문자 검색 STRing find to CHaracter, 일치하는 문자로 시작되는 문자열의 포인터를 반환";

    char str[] = "Manners Maketh Man";

    char* search = strchr(str, 'e');

    while (search != NULL) {

        cout << search << endl;
        search = strchr(search + 1, 'e');
    }
}

void e_strstr() {

    string e = "strstr: 문자열안에서 문자열 검색 STRing STRing, 일치하는 문자열로 시작되는 문자열의 포인터를 반환";

    char str[] = "Manners Maketh Man";

    char* search = strstr(str, "Man");

    while (search != NULL) {

        cout << search << endl;
        search = strstr(search + 1, "Man");
    }
}

void e_strtok() {

    string e = "strtok: 특정문자를 기준으로 문자열 절단 STRing TOKenizer";

    char s1[] = "I,My,Me,Mine";

    char* ptr = strtok(s1, ",");

    while (ptr != NULL) {
        cout << ptr << endl;
        ptr = strtok(NULL, ","); //null을 넣어야 자른 후의 문자열 부터 시작함, 자른 곳을 null로 채우기 때문
    }
}

void e_atoi() {

    string e = "atoi: 문자열을 정수로 바꿈 Askii TO Integer.";

    char s1[] = "2314";
    char s2[] = "3.141592";

    printf("%d, %f", atoi(s1), atof(s2));

}

void e_strtol() {

    string e = "strtol: 문자열중 특정 진법으로 표기된 것을 변환 STRing To Long";
    char s1[] = "0xc8c8c8 411 100 100";
    int hex1, dec1, oct1, hex2;
    char* end;

    hex1 = strtol(s1, &end, 16);
    dec1 = strtol(end, &end, 10);
    oct1 = strtol(end, &end, 8);
    hex2 = strtol(end, NULL, 16);

    printf("%x, %d, %o, %x \n", hex1, dec1, oct1, hex2);
    printf("%d, %d, %d, %d \n", hex1, dec1, oct1, hex2);
}

void strInfo(string str) {

    cout << str.c_str() << endl;
    cout << "size()    : " << str.size() << endl; //mySize 리턴
    cout << "length()  : " << str.length() << endl; //mySize 리턴, 즉 2개는 동일하다
    cout << "capacity(): " << str.capacity() << endl; //15 31 47 해당 string 객체에 할당된 메모리 크기
    cout << "max_size(): " << str.max_size() << endl;
    cout << "====================================" << endl;
}

void e_iterator(string str) {

    for (auto i = 0; i < str.length(); i++)
        cout << str.at(i);

    cout << endl;
    cout << "=======================" << endl;

    for (string::iterator i = str.begin(); i != str.end(); i++) //str.end는 문자열의 끝+1을 가리키는 이터레이터 포인터를 반환
        cout << *i;

    cout << endl;

}

