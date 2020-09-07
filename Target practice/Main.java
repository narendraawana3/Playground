#include<iostream> 
using namespace std;
int main()
{
  int n, sum, tot=0, count = 0;
  cin>>sum;
  while(sum>tot)
  {
    cin>>n;
    tot = tot+ n;
    count++;
  }
  cout<<"The number of turns is "<<count;
}