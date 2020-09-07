#include<iostream>
using namespace std;
int main()
{
  int w,a,c;
  cin>>w>>a>>c;
  int x=a*75 + c*30;
  if(w>x)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}