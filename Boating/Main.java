#include<iostream>
using namespace std;
int main()
{
  int weight, num_adults, num_children;
  std::cin>>weight;
  std::cin>>num_adults;
  std::cin>>num_children;
  if (weight>=(75*num_adults+30*num_children))
      std::cout<<"Boat is stable";
  else
      std::cout<<"Boat will drow";
}