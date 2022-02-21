package Marvellous;
import java.util.*;
public class ArrayR
{
    public int Arr[];
  
    public ArrayR(int iSize)
    {
        Arr = new int[iSize];
    }    
    public void Accept()
    {
     Scanner sobj = new Scanner(System.in);
     int iCnt=0;
     System.out.println("Entered Element is :");
     for(iCnt=0;iCnt < Arr.length;iCnt++)
     {
         Arr[iCnt]=sobj.nextInt();
     }       
    }
    public void Display()
    {
      int iCnt=0;
      System.out.println("Element are ");
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
          System.out.println(Arr[iCnt]);
      }
    }   
}
