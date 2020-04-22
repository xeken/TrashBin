#include <iostream>
#include <stdlib.h>
#include <cstring>
#include <string>

using namespace std;

string solution(int n)
{
    string answer = "";

    if(n < 4){
        if(n == 1) answer = "1";
        else if(n == 2) answer = "2";
        else if(n == 3) answer = "4";
    }
    else if(n > 3){ // int to string
        if(n%3 == 0) answer = n/3 + "4";
        else if(n%3 == 1) answer = n/3 + "1";
        else if(n%3 == 2) answer = n/3 + "2";
    }

    return answer;
}

int main()
{
    
    cout << 5%3 << "       " << solution(5) << endl;
    cout << 7%3 << "       " << solution(7) << endl;
    cout << 12%3 << "       " << solution(12) << endl;
}