#include<iostream>
using namespace std;
int main()
{
  int p,d;
  float m;
  cin>>m>>p>>d;
   float a=m*p;
  // m>=r ? cout<<"Can reach" : cout<<"Cannot reach";
  if(d<=a)
    cout<<"Can reach";
  else cout<<"Cannot reach";
  return 0;
}