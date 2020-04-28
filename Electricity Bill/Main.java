#include<iostream>
using namespace std;
int main()
{
 int n;
  int x;
  cin>>n;
  if(n<=200)
    x=n*0.50;
  else if(n<=400)
    x=100+((n-200)*0.65);
  else if(n<=600)
    x= 200+((n-400)*0.80);
  else 
    x = 425+ ((n-600)*1.25);
 cout<<"Rs."<<x;
}