import java.util.*;
class ArrayR
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
class EvenNumber
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