import java.util.*;
class Program138
{
    public static void main(String str[])
    {
        Scanner Sobj=new Scanner(System.in);
        int iNo1=0,iNo2=0,iAns=0;

        System.out.println("Enter First number");
        iNo1=Sobj.nextInt();

        System.out.println("Enter Second number");
        iNo2=Sobj.nextInt();

        iAns=iNo1 + iNo2;
        System.out.println("Addition is :"+iAns);
    }
}