#include<iostream>
int main()
{
  int w, wf;
  std::cin>>w>>wf;
  if (wf<w)
    std::cout<<"Yes, you can enter.";
  else if (wf==w)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}