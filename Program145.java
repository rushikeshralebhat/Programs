import java.util.*;
   class ArrayX
   {
       public int Arr[];

       public ArrayX(int iSize)
       {
          Arr = new int[iSize];
       }
       public void Accept()
       {
         Scanner sobj = new Scanner(System.in);
         int iCnt = 0;  
         System.out.println("Enter Elements");
         for(iCnt = 0; iCnt < Arr.length;iCnt++)
         {
             Arr[iCnt]=sobj.nextInt();
         }
       }
       public void Display()
       {
           int iCnt=0;
           System.out.println("Element are :");
           for(iCnt=0;iCnt<Arr.length;iCnt++)
           {
               System.out.println(Arr[iCnt]);
           }  
       
       }
   } 
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
   class Program145
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
