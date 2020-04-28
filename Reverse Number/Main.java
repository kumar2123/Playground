#include <iostream>
int main() 
{
	int n, rn=0,re;
  std::cin>>n;
  while(n!=0)
  {
    re=n%10;
    rn=rn*10+re;
    n/=10;
  }
  std::cout<<rn;
	return 0;
}