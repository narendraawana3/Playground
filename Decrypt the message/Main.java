#include<iostream>
using namespace std;
int main()
{
	int e,t,n,sum=0;
	cin>>e>>t;
	n=e+t;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		sum=sum + i;
		
	}
	if(n==sum)
	cout<<"They can read the message";
	else
	cout<<"They can't read the message";
	return 0;
}