#include<iostream>

using namespace std;

typedef unsigned int UINT;

 /*
    op1  op2   &  |  ^
    1    0     0  1  1
    0    1     0  1  1
    0    0     0  0  0
    1    1     1  1  0

 iNo  0000 0000 1110 0100 1111 0100 1011 1010    
 iPos 6 
 iRet 0000 0000 1110 0100 1111 0100 1001 1010
 */


 UINT ToggleBit(UINT iNo,UINT iPos1,UINT iPos2)
{
   UINT iMask1=0x00000001;
   UINT iMask2=0x00000001;
   int iResult=0;

   iMask1 = iMask1 << (iPos1 -1);
   iMask2 = iMask2 << (iPos2 -1);
   
   iResult = iNo ^ iMask1 || iNo ^ iMask2;

   return iResult;

}
int main()
{
 UINT iValue=0,iRet=0,i=0;

 cout<<"Enter Number\n";
 cin>>iValue;
 
 cout<<"Enter the frist position of bit\n";
 cin>>i;
 cout<<"Enter the second position of bit\n";
 cin>>j;

 iRet=ToggleBit(iValue,i,j);

 cout<<"Updeted number is "<<iRet<<"\n";

    return 0;
}