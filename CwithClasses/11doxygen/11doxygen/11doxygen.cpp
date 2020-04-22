/**
 @mainpage

 @author 조병현
 @date 06 Feb 2020
 @version 0.0.1

 @section sec 섹션
 섹션은 명령 id 출력문자 순으로 작성합니다.

 @section level 순서레벨
 -# 1레벨1
 -# 1레벨2
  -# 2레벨1
  -# 2레벨2
   -# 3레벨1
   -# 3레벨2
    -# 4레벨1
    -# 4레벨2
     -# 5번째부터는 반복입니다.

 @ref e_plus ref 링크입니다.
 @ref https://google.com

 @brief 브리프는 밑에 써도 @n 제일 위에 출력된답니다.

*/

#include <iostream>
#include <string>

using namespace std;

string e_plus(string s1, string s2);
string e_plus(string s1, int n1);
string e_plus(string s1, float f1);
void crypto(string str);

int main()
{
    cout << e_plus("스트링", "스트링") << endl;
    cout << e_plus("스트링", 0) << endl;
    cout << e_plus("스트링", 0.1f) << endl;
    crypto("str");
    return 0;
}


/**
@brief 이거슨 플러스여

*/
string e_plus(string s1, string s2) {

    return s1.append(s2);
}


string e_plus(string s1, int n1) {

    return s1.append(to_string(n1));
}


string e_plus(string s1, float f1) {

    return s1.append(to_string(f1));
}


/**
@brief 입력받은 비밀번호를 sha-512방식으로 암호화 하여 반환
@fn private string crypto(string password)
@param string 문자열
@return string 문자열
@exception NoSuchAlgorithmException 암호알고리즘이 호출되어도, 현재 상황에서 사용할 수 없을 때
@todo 바로 DB에 입력할 것
@code
private String crypto(String password){

  String crypto = null;

  try {

   MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
   messageDigest.update(password.getBytes(), 0, password.getBytes().length);
   crypto = new BigInteger(1, messageDigest.digest()).toString(16);
  }
  catch (NoSuchAlgorithmException e) {
   e.printStackTrace();
  }

  return crypto;
 }
@endcode
*/
void crypto(string str) {

    printf("\n");

}