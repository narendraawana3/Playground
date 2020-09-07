#include<iostream>
using namespace std;
int main() 
{
  int a,b,c,i,n,hcf=1;
  cin>>a>>b>>c;
  (a>b && a>c) ? ( b>c ? cout<<"The treasure is in box which has number "<<b : cout<<"The treasure is in box which has number "<<c) : ( b>a && b>c ? (a>c?cout<<"The treasure is in box which has number "<<a:cout<<"The treasure is in box which has number "<<c) : (a>b?cout<<"The treasure is in box which has number "<<a:cout<<"The treasure is in box which has number "<<b)  ) ;
  n=a+b+c;
   for(i=2;i<n;i++)
   {
   	if(a%i==0 && b%i==0 && c%i==0)
   	{
   		hcf=i;
   		break;
   		
	   }
    } 
    cout<<"\nThe code to open the box is "<<hcf;     
return 0;
}