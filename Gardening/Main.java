#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  std::cin>>r;
  std::cin>>c;
  std::cin>>t;
   if(r+c==t || (r+c)*2==t)
   std::cout<<"It is a mango tree";
 else  
   std::cout<<"It is not a mango tree";
}