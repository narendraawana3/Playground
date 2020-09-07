#include<iostream>
using namespace std;
string removeCharacter(string str, char ch)
{
    int len = str.length();
    string s = "";
    for(int i = 0; i < len; i++)
    {
        char c = str[i];
        if(c == ch)
            continue;
        else
            s = s + c;
    }
    return s;
}
int main()
{
    string str;
    char ch;
    getline(cin, str);
    cin >> ch;
    cout << removeCharacter(str, ch);
    return 0;
}