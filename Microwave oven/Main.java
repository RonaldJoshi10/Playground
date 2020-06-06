#include<iostream>
using namespace std;
int main()
{
  int item;
  float heat;
  std::cin>>item>>heat;
  if (item==3)
    std::cout<<heat*2;
  else if (item==2)
    std::cout<<1.5*heat;
  else
    std::cout<<"Number of items is more";
}