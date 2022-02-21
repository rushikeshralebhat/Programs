import java.util.*;
class Marvellous
{
    public boolean CheckArmstrong(int iNo)
    {
        int Temp=0,iDigCnt=0,iCnt=0;
        int iDigit=0,iPower=1,iSum=0;
        if(iNo < 0)
        {
            iNo=-iNo;
        }
        Temp=iNo;
        while(Temp != 0)
        {
            iDigCnt++;
            Temp=Temp/10;
        }
        Temp=iNo;

        while(Temp != 0)
        {
            iDigit=Temp % 10;
            for(iCnt=1;iCnt <= iDigCnt;iCnt++)
            {
                iPower=iPower * iDigit;
            }
            iSum= iSum * iPower;
            iPower=1;
            Temp=Temp / 10;
        }
          
          if(iSum==iNo)
          {
           return true;
          }
          else
          {
              return false;
          }
    }
}
class Program142
{
    public static void main(String arg[])
    {
       Scanner sobj = new Scanner(System.in);      
        int i = 0;
        boolean bRet=false;
       System.out.println("Enter Number");
       i = sobj.nextInt();

        Marvellous mobj=new Marvellous();
        bRet=mobj.CheckArmstrong(i);

        if(bRet==true)
        {
            System.out.println("It is Armstrong Number");
        }
        else
        {
            System.out.println("It is not Armstrong Number");
        }
    } 
}