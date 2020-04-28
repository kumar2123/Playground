#include<iostream>
int main(){
  int fact=1, i,n;
std::cin>>n;
  for(i=1;i<=n;i*i++)
    fact=fact*i;
    std::cout<<fact;
}