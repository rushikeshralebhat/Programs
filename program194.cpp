#include<iostream>

using namespace std;

typedef unsigned int UINT;

 UINT ToggleRange(UINT iNo,UINT iStart,UINT iEnd)
{
   UINT iMask1=0xFFFFFFFF,iMask2=0xFFFFFFFF,iMask=0;
   UINT iResult=0;

   iMask1 = iMask1 << (iStart - 1); 
   iMask2 = iMask2 >> (32  - iEnd); 
    
   iMask = iMask1 & iMask2;

   iResult = iMask ^ iNo;

   return iResult;

}
int main()
{
 UINT iValue=0,iRet=0,i=0,j=0;

 cout<<"Enter Number\n";
 cin>>iValue;
 cout<<"Enter starting position\n";
 cin>>i;
 cout<<"Enter ending position\n";
 cin>>j;
 iRet=ToggleRange(iValue,i,j);

 cout<<"Updeted number is "<<iRet<<"\n";

    return 0;
}