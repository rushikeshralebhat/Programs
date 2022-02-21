#include<iostream>

using namespace std;

typedef unsigned int UINT;
 UINT CountBit(UINT iNo)
{
   UINT i=0,iCnt=0,iResult=0;
   UINT iMask=0X00000001;

   for(i=1;i<32;i++,iMask=iMask << 1)
   {
       if((iNo & iMask) == iMask)
       {
           iCnt++;
       }
       
   }
   return iCnt;

}
int main()
{
 UINT iValue=0,iRet=0;

 cout<<"Enter Number\n";
 cin>>iValue;
 iRet=CountBit(iValue);

 cout<<"Number of Bit which are ON :"<<iRet<<"\n";

    return 0;
}