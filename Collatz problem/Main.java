#include<iostream>
using namespace std;
int main()
{
  int n, count=0;
  cin>>n;
  cout<<n<<endl;
 while(n>1)
  {
   if(n%2==0)
     n=n/2;
    else if(n%2==1)
      n=3*n+1;
    cout<<n<<endl;
    count++;
  }
  cout<<count;
}