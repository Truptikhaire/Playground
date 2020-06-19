#include<iostream>
int main()
{
  int a=3,b=2,c1,c2,c3,c4,c5;
  std::cin>>a>>b;
  c1=a+b;
  c2=a-b;
  c3=a*b;
  c4=a/b;
  c5=a%b;
  std::cout<<"a+b="<<c1;
  std::cout<<"\na-b="<<c2;
  std::cout<<"\na*b="<<c3;
  std::cout<<"\na/b="<<c4;
  std::cout<<"\na%b="<<c5;
}