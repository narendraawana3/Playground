#include<iostream>
using namespace std;
int main()
{
	int r,c,n,m;
	cin>>r>>c>>n;
	m=r*c;
	if(n<=m) 
	{
	if( n<=(r+1) || n<=m && n>(m-r) ) // || n==(r*2 + 1) || n==(r*3 + 1) )
	cout<<"Yes";
	else {
	for(int i=2; i<(c-1) ;i++)
    {
    	if(n==(r*i +1)) {
    	cout<<"Yes";
    	exit(0); }
    }
    	cout<<"No";
    }
	
	
    }  
	return 0;
}