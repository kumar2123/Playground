#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int balls,a,i,b;
  float to,tof,rr,cr;
  cin>>balls>>a>>i>>b;
  if(balls<=300)
  {
    to=balls/6;
    int n=b/6;
    int p=b%6;
    tof=((float)n+(float)p/10);
    rr=i/tof;
    cr=a/to;
    cout<<to<<"\n";
    std::cout<<fixed<<setprecision(1)<<tof<<"\n";
    cout<<rr<<"\n"<<cr<<"\n";
    if(rr>cr)
      cout<<"Eligible to Win";
    else
      cout<<"Not Eligible to Win";
    
  }
}