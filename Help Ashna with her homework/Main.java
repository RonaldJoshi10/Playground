#include<iostream>
int main()
{
  int sum,diff,prod,quo,rem,a,b;
  std::cin>>a;
  std::cin>>b;
  sum = a+b;
  diff = a-b;
  prod = a*b;
  quo = a/b;
  rem = a%b;
  std::cout<<"a+b="<<sum<<"\n";
  std::cout<<"a-b="<<diff<<"\n";
  std::cout<<"a*b="<<prod<<"\n";
  std::cout<<"a/b="<<quo<<"\n";
  std::cout<<"a%b="<<rem<<"\n";  
}