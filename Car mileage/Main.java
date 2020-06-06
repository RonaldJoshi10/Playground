#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol, dist;
  std::cin>>mileage>>petrol>>dist;
  if(mileage*petrol>=dist)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";  
}