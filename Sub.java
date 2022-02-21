import java.util.*;
class Marvellous
{
       public int EvenCount(int Brr[])
       {
           int iCnt=0,iSub=100;
           for(iCnt=0;iCnt<Brr.length;iCnt++)
           {
               
           }
           return iSub;
       }
}
class EvenNumber
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);
      int iLength=0,iCnt=0;
      int iRet=0;
      System.out.println("Enter Number of Element");
      iLength = sobj.nextInt();
  
       int Arr[] = new int[iLength];
   
      System.out.println("Element are :"); 
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
          Arr[iCnt]=sobj.nextInt();
      } 
      Marvellous mobj = new Marvellous();
      iRet=mobj.EvenCount(Arr);
      System.out.println("Even Numbers :"+iRet);

    }
}