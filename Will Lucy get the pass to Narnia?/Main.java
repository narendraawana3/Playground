#include <iostream>
using namespace std;

int main() 
{
   int a,b,m;
  cout<<"Enter first number : Enter second number : Menu \n";
  cin>>a>>b;
  cout<<"1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Remainder \n";
  cin>>m;
  switch(m) { 
    case 1: cout<<a+b;
      break;
    case 2:  cout<<a-b;
      break;
    case 3: cout<<a*b;
      break;
    case 4: cout<<a/b;
      break;
    case 5:  cout<<a%b;
      break;
    default:  cout<<"Invalid operation";
  }
      return 0;
  }
  
