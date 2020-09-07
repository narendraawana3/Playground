#include<iostream>
using namespace std;
int main()
{
 int fp,fd,fs,sp,sd,ss,ap,ad,as;
 cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
 float Flipkart=(fp*(100-fd))/100 + fs;
 float Snapdeal=(sp*(100-sd))/100 + ss;
 float Amazon=(ap*(100-ad))/100 + as;
 cout<<"In Flipkart Rs."<<Flipkart<<endl;
 cout<<"In Snapdeal Rs."<<Snapdeal<<endl;
 cout<<"In Amazon Rs."<<Amazon<<endl;
 
( Flipkart<=Snapdeal && Flipkart<=Amazon ) ? cout<<"He will prefer Flipkart" : (Snapdeal<=Amazon && Snapdeal<=Flipkart ? cout<<"He will prefer Snapdeal" : cout<<"He will prefer Amazon"); 
 
 return 0;


}