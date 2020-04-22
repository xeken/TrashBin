#include <iostream>
#include <string>

#pragma warning(disable:4996)

using namespace std;

void print(char* str);
int find(char* str, char token);
void compare(char* s1, char* s2);
char* change(char* str);
char* tokenizer(char* str, const char* token);
char* atoA(char* str);
void contain(char* s1, char* s2);

int main()
{
    char str1[20];
    char str2[20];
    char str3[40];
    //No.1
    cout << "1.문자열 입력및 저장" << endl;
    cin.getline(str1, 30);
    cin.getline(str2, 30);
    cout << "===============================" << endl;

    //No.2
    cout << "2.저장된 문자열 길이와 문자열 출력" << endl;
    print(str1);
    print(str2);
    cout << "===============================" << endl;

    //No.3
    cout << "3.str3에 str1 복사" << endl;
    strcpy(str3, str1);
    printf("%s \n", str3);
    cout << "===============================" << endl;

    //No.4
    cout << "4.str3에 str2 이어 붙이기" << endl;
    strcat(str3, str2);
    printf("%s \n",str3);
    cout << "===============================" << endl;

    //No.5
    cout << "5.str3에 'e'검색후 위치 출력" << endl;
    printf("%d \n", find(str3, 'e')+1);
    cout << "===============================" << endl;

    //No.6
    cout << "6.str1과 str3를 비교하고 strcmp의 값 리턴" << endl;
    compare(str1, str3);
    cout << "===============================" << endl;

    //No.7
    cout << "7.str3의 첫번째 문자와 마지막 문자의 위치를 바꿈" << endl;
    printf("%s \n", change(str3));
    cout << "===============================" << endl;

    ////No.8
    //cout << "8.strtok 구현" << endl;
    //char* ptr = tokenizer("santa, clara, I, wanna, go", ",");

    //while (ptr != NULL) {
    //    cout << ptr << endl;
    //    ptr = tokenizer(NULL, ",");
    //}
    //cout << "===============================" << endl;

    //No.9
    cout << "9.str1의 소문자를 대문자로" << endl;
    printf("%s to", str1);
    printf(" %s \n", atoA(str1));
    cout << "===============================" << endl;

    //No.10
    cout << "10.str3에 str1이 포함되어 있는지 검사하고 리턴값 출력" << endl;
    contain(str3, str1);
    cout << "===============================" << endl;

    return 0;
}

void print(char* str) {

    cout << "input string: " << str << endl;
    cout << "string length: " << strlen(str) << endl;
}

int find(char* str, char token) {

    char* where = strchr(str, token);

    if (where == NULL)
        return 0;

    for (unsigned int i = 0; i < strlen(str); ++i)
        if (str[i] == (*where))
            return i;

    return 0;
}

void compare(char* s1, char* s2) {

    int result = strcmp(s1, s2);

    cout << "전자가 크면 1, 동일하면 0, 후자가 크면 -1 >> " << result << endl;
}

char* change(char* str) {

    char front = str[0];
    char end = str[strlen(str) - 1];

    // strcat(str[strlen(str) - 1]);

    str[0] = end;
    str[strlen(str) - 1] = front;

    return str;
}

char* tokenizer(char* str, const char* token) {

    static char* pStr; // strtok를 한번만 넣진 않잖아? while에 넣어서 여러번 사용하니까 static을 사용하는겨, 이전 정보를 메모리에 가지고 있으려고
    const char* pToken;

    int token_len = strlen(token);

    if (str == NULL)
        str = pStr; //잘린 문자열부터 시작하겠다는 뜻
    else
        pStr = str;

    while (*pStr) {
        pToken = token;

        while (*pToken) {
            if (*pStr == *token) { //문자열이 토큰과 동일할 시
                *pStr = NULL; // 이 자리를 null로 채우고
                pStr++; //다음으로 옮기고
                return str;
            }
            pToken++; //","일 수도 ",,"일 수도 있응께
        }
        pStr++;
    }

    return str;
}

char* atoA(char* str) {

    for (unsigned int i = 0; i < strlen(str); ++i)
        if ('a' <= str[i] && str[i] <= 'z')
            str[i] = (char)toupper(str[i]);

    return str;
}

void contain(char* s1, char* s2) {

    if (strstr(s1, s2) != NULL)
        cout << "contain" << endl;
    else
        cout << "no" << endl;

}

