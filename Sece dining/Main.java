#include<iostream>
#include<string>
using namespace std;
int main()
{
 int r;
 string door;
 cin>>door>>r;
 if(door=="front")
 {
 	switch(r)
 	{
 		case 1: cout<<"Left Handed";
 		break;
 		case 2: cout<<"Right Handed";
 		break;
      default: cout<<"Right Handed";
	 }
 }
 else if(door=="rear")
 {
 	switch(r)
 	{
 		case 1: cout<<"Right Handed";
 		break;
 		case 2: cout<<"Left Handed";
 		break;
      default: cout<<"Left Handed";
	 }
 }
 return 0;
}