#include <iostream>
using namespace std;
int main() 
{
	int m,n;
  cin>>m;
  if(m==0)
    cout<<"0";
  while(m>0) {
    n=m%10;
    m=m/10;
    cout<<n;
  }
    
  
	return 0; 
}