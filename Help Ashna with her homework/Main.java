#include<iostream>
using namespace std;
int main()
{
  int a,b,sum,sub,mul,div,rem;
  cin>>a>>b;
  sum=a+b;
  sub=a-b;
  mul=a*b;
  div=a/b;
  rem=a%b;
  cout<<"a+b="<<sum<<endl;
  cout<<"a-b="<<sub<<endl;
  cout<<"a*b="<<mul<<endl<<"a/b="<<div<<endl<<"a%b="<<rem;
  return 0;
}