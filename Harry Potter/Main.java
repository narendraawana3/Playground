#include<iostream>

using namespace std;
int main()
{
  int n,a,b;
  cin>>n;
  a=n/1000;
  b=n%10;
  n=a+b;
  //n==2 ? cout<<n : 
  cout<<n;
  return 0;
}
