#include<iostream>
int swap(int &x,int &y)
{
  int t;
  t=x;
  x=y;
  y=t;
  return 0;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<< b;
  swap(a,b);
  std::cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
  return 0;
}