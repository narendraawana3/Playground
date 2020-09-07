#include<iostream>
using namespace std;
int main()
{
  int n;
  float t;
  cin>>n>>t;
  switch(n) {
    case 1: 
      cout<<t;
      break;
    case 2: 
      t=t*1.5;
      cout<<t;
      break;
    case 3: 
      t=t*2;
      cout<<t;
      break;
    default: cout<<"Number of items is more";
      return 0;
  }
}