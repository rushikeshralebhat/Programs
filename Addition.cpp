using namespace std;
#include<iostream>

class Demo
{
   public:
   
 int Additon(int iNo1, int iNo2)
 {
   return iNo1 + iNo2;
 }
};
int main()
{
   Demo *p=NULL;
   int z;
   int x,y;
   cout<<"Enter number";
   cin>>x;
   
   cout<<"Enter number";
   cin>>y;
   cout<<"Enter number";
   z=p->Additon(x,y);
   cout<<z;

    return 0;
}