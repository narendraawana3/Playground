#include<iostream>
using namespace std;
int main()
{
  int unit, bill;
  cin>>unit;
  if( unit<= 200)
  {  int h=unit*0.5;
    cout<<"Rs."<<h; }
  else if( unit>200 && unit<=400)
    cout<<"Rs."<<(int)unit*0.65+100;
  else if( unit>400 && unit<=600)
    cout<<"Rs."<<(int)unit*0.80+200;
  else if( unit>600 )
    cout<<"Rs."<<(int)unit*1.25+425;
  return 0;
  
}