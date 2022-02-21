using namespace std;
#include<iostream>
class Demo
{
  public:
  void Display(int iNo)
  {
      int i;
      for(i=1;i<=iNo;i++)
      {
       cout<<"*\t";
      }
  }
};
int main()
{
    int iValue;
    Demo *p=NULL;
    cout<<"Enter number\n";
    cin>>iValue;
    p->Display(iValue);
    return 0;
}