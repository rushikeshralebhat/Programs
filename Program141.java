import java.util.*;
class Marvellous
{
    public boolean checkPrime(int iNo)
    {
      int iCnt=0;
      boolean bFlag= true;
      for(iCnt=2;iCnt<=iNo/2;iCnt++)
      {
         if((iNo % iCnt)==0)
          {
              bFlag=false;
               break;
          }
      }      
     return bFlag;
    }
}
class Program141
{
    public static void main(String arg[])
    {
       Scanner sobj = new Scanner(System.in);      
        int i = 0;
        boolean bRet=false;
       System.out.println("Enter Number");
       i = sobj.nextInt();

        Marvellous mobj=new Marvellous();
        bRet=mobj.checkPrime(i);

        if(bRet==true)
        {
            System.out.println("It is Prime Number");
        }
        else
        {
            System.out.println("It is not prime");
        }
    } 
}