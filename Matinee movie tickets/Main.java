#include<iostream>
using namespace std;
int main()
{
  int age;
  float t;
  cin>>age>>t;
  if(t>10 && t<11) 
  {
    if(age>13)
      cout<<"$8.00";
    else 
      cout<<"$4.00";
  }
   else if(t>13 && t<14) {
    if(age>13)
      cout<<"$5.00";
    else 
      cout<<"$2.00";
  } 
   else if(t=18.0) {
    if(age>13)
      cout<<"$8.00";
    else 
      cout<<"$4.00";
  }
   else if(t==22.0) {
    if(age>13)
      cout<<"$8.00";
    else 
      cout<<"$4.00";
  } 
  return 0;
}