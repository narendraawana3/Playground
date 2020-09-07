#include<iostream>
using namespace std;
int main()
{
	int a,b,c,d,sum=0;
	cin>>a>>b>>c>>d;
	if(a>=0 && b>=0 && c>=0 && d>=0) {
	
	sum=a+c;
	if(b+d<100)
	{
		int x;
		x= (b+d);
		cout<<sum<<endl<<x;
	}
	else if(b+d>=100)
	{
		int y,r;
		r = (b+d)/100;
		sum = sum +r;
		y = (b+d) % 100;
		cout<<sum<<endl<<y;
	}
}
	return 0;
}