import java.util.*;
import MarvellousNumbers.ArrayX;
  class Marvellous extends ArrayX
   {
       public Marvellous(int iValue)
       {
           super(iValue);
       }
       public int Add()
       {
         int iCnt=0,iSum=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
          iSum =iSum + Arr[iCnt];
        }
        return iSum;
      }
   }
   
class Program146
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iLength=0,iRet=0;
  
        System.out.println("Enter the number of element");

        iLength=sobj.nextInt();

        Marvellous mobj = new Marvellous(iLength);
        mobj.Accept();
        mobj.Display();
        iRet=mobj.Add();
        System.out.println("Addition is :"+iRet);

    }
}
