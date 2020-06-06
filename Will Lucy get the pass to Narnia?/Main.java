#include<iostream>
int main()
{
  int choice, a, b;
  std::cout<<"Enter first number : Enter second number : Menu"<<"\n";
  std::cout<<"1.Addition"<<"\n";
  std::cout<<"2.Subtraction"<<"\n";
  std::cout<<"3.Multiplication"<<"\n";
  std::cout<<"4.Division"<<"\n";
  std::cout<<"5.Remainder"<<"\n";
  std::cin>>a>>b;
  std::cin>>choice;
  switch(choice)
  {
    case 1:
      std::cout<<a+b<<"\n";
      break;
    case 2:
       std::cout<<a-b<<"\n";
       break;
    case 3:
       std::cout<<a*b<<"\n";
       break;
    case 4:
       std::cout<<a/b<<"\n";
       break;
    case 5:
       std::cout<<a%b<<"\n";
       break;
    case 6:
       std::cout<<"Invalid operation";
  }
}  