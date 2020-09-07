#include<iostream>
using namespace std;
int main(){
  int n,i,x;
  cin>>n;
  if(n==0)
    cout<<"1";
  else if(n>0) {
  x=n;
  for(i=1;i<n;i++)
  {
  x=x*(n-i);
  }
  cout<<x;
  }
}