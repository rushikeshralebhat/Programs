import java.util.*;
class Program143
{
  public static void main(String arg[])
  {
      Scanner sobj=new Scanner(System.in);
      int iValue=0,  iCnt=0;
      System.out.println("Enter Number os Element");
      iValue=sobj.nextInt();
      
      int Arr[] = new int[iValue];

      System.out.println("Enter Numbers");
  
      for(iCnt=0; iCnt < Arr.length; iCnt++)
      {
          Arr[iCnt] = sobj.nextInt();
      }

      System.out.println("Entered Element are");
      for(iCnt=0;iCnt <Arr.length;iCnt++)
      {
          System.out.println(Arr[iCnt]);
      }
  }
}