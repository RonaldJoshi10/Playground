#include<iostream>
using namespace std;
int main()
{
  int af,df,sf,as,ds,ss,aa,da,sa,pf,ps,pa;
  std::cin>>af>>df>>sf>>as>>ds>>ss>>aa>>da>>sa;
  pf=af+sf-(af*df/100);
  ps=as+ss-(as*ds/100);
  pa=aa+sa-(aa*da/100);
  std::cout<<"In Flipkart Rs."<<pf<<"\n";
  std::cout<<"In Snapdeal Rs."<<ps<<"\n";
  std::cout<<"In Amazon Rs."<<pa<<"\n";
  if(pf<=ps && pf<=pa)
    std::cout<<"He will prefer Flipkart";
  else if (ps<pf && ps<pa)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
}