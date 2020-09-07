#include<iostream>
using namespace std;
int main()
{
  int bir,cur;
  cin>>bir>>cur;
  if(bir>cur) {
    bir+=1900;
    cur+=2000; 
  cout<<cur-bir;
  }
  else
  {
    bir+=2000;
    cur+=2000;
    cout<<cur-bir;
  }
  
  
}