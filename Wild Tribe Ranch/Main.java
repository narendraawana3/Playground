#include<iostream>
using namespace std;

int main() 
{
   int m_wei, wei;
  cin>>m_wei>>wei;
  if(wei<=m_wei)
  {
    cout<<"Yes, you can enter.";
    if(wei==m_wei)
      cout<<" Kindly use a rope.";
  }
  else 
    cout<<"Sorry, you can't enter";
    return 0;
}