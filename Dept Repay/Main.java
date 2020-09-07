#include<iostream>
using namespace std;
int main()
{
  int x,r,y;
  cin>>x>>r>>y;
  float interest, amount, discount, settlement;
  interest=(x*r*y)/100;
  amount=x+interest;
  discount=interest*0.02;
  settlement=amount-discount;
  cout<<interest<<endl;
  cout<<amount<<endl;
  cout<<discount<<endl;
  cout<<settlement;
  return 0;
}