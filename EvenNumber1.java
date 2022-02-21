import java.util.*;
import Marvellous.ArrayR;
class Marvellous extends ArrayR
{
    public Marvellous(int iValue)
    {
        super(iValue);
    }
    public int Even()
    {
      int iCnt=0,i=0;
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
          if(Arr[iCnt] % 2==0)
          {
              i=i + Arr[iCnt];
          }
      }
      return i;
    } 
}
class EvenNumber1
{
    public static void main(String args[])
    {
      Scanner sobj = new Scanner(System.in);
      int iLength=0,iRet=0;
      System.out.println("Enter Number of Element :");
      iLength=sobj.nextInt();

      Marvellous mobj = new Marvellous(iLength);
      mobj.Accept();
      mobj.Display();
      iRet=mobj.Even();
      System.out.println("Even Number is :"+iRet);

    }
    

}