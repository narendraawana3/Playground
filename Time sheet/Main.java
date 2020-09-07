#include<iostream>
using namespace std;
int main()
{
 int sun,mon,tue,wed,thu,fri,sat,n;
 float ss;
 cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
 
 if(sun>=0 && sun<=8)
 ss=sun*150;
 else if(sun>8) {
 n=sun-8;
 ss= n*15 + sun*150; }
 
 if(sat>=0 && sat<=8)
 ss= ss + (sat*125);
 else if(sat>8) {
 n=sat-8;
 ss= ss + (n*15 + sat*125); }
 
 if(mon>=0 && mon<=8)
 ss=ss + (mon*100);
 else if(mon>8) {
 n=mon-8;
 ss= ss + (n*15 + mon*100); }
 
  if(tue>=0 && tue<=8)
 ss=ss + (tue*100);
 else if(tue>8) {
 n=tue-8;
 ss= ss + (n*15 + tue*100); }
 
  if(wed>=0 && wed<=8)
 ss=ss + (wed*100);
 else if(wed>8) {
 n=wed-8;
 ss= ss + (n*15 + wed*100); }
 
  if(thu>=0 && thu<=8)
 ss=ss + (thu*100);
 else if(thu>8) {
 n=thu-8;
 ss= ss + (n*15 + thu*100); }
 
  if(fri>=0 && fri<=8)
 ss=ss + (fri*100);
 else if(fri>8) {
 n=fri-8;
 ss= ss + (n*15 + fri*100); }
 
 /*int x=sun + mon + tue + wed + thu + fri + sat;
 if(x>40)
 {
   x=x-40;
   ss = ss + (x*25);	
 }  */
 cout<<ss;
 return 0;
}