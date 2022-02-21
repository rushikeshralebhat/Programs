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


 UINT ToggleNibbel(UINT iNo)
{
   UINT iMask=0xF000000F;
   UINT iResult=0;
     //  1111    0000    0000    0000    0000    0000    0000    1111
    //    F       0        0       0       0       0       0       F
    // 0xF000000F
    
   
   iResult = iMask ^ iNo;

   return iResult;

}
int main()
{
 UINT iValue=0,iRet=0,i=0,j=0;

 cout<<"Enter Number\n";
 cin>>iValue;
 iRet=ToggleNibbel(iValue);

 cout<<"Updeted number is "<<iRet<<"\n";

    return 0;
}