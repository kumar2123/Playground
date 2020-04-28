#include<iostream>
using namespace std;
int main()
{
 int x,y,r;
  float inter,amount,discount,settlement;
  cin>>x>>y>>r;
  inter=(x*y*r)/100;
  amount=x+inter;
  discount=(inter*2)/100;
  settlement=x+inter-discount;
  cout<<inter<<"\n";
  cout<<amount<<"\n";
  cout<<discount<<"\n";
  cout<<settlement<<"\n";
  return 0;
}