#include <iostream>
#include <stdlib.h>
#include <string>
#include <cstring>

using namespace std;

int main(){
    
    string rowWord; // = "BANANA";
    string columnWord; //= "PIDZAMA";
    cin >> rowWord >> columnWord;
    char cross[columnWord.length()][rowWord.length()];

    int x, y;
    for(x = 0; x < columnWord.length(); x++)
        for(y = 0; y < rowWord.length(); y++)
            if(columnWord.at(x) == rowWord.at(y))
                goto okay;

    okay:
    for(int i = 0; i < columnWord.length(); i++){
        for(int j = 0; j < rowWord.length(); j++){
            if(j == y) 
                cross[i][j] = columnWord.at(i);
            else 
                cross[i][j] = '.';
        }
        if(i == x)
            for(int k = 0; k < rowWord.length(); k++)
                cross[i][k] = rowWord.c_str()[k];
    }

    //strcpy(cross[x], rowWord.c_str());

    for(int i = 0; i < columnWord.length(); i++){
        for(int j = 0; j < rowWord.length(); j++)
            cout<< cross[i][j];
        cout<< endl;
    }

    return 0;
}