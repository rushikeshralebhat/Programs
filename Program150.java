import java.util.*;
class StringX
{
    public String str;

    public void Accept()
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter String");
        str=sobj.nextLine();
    }

    public void Display()
    {
        System.out.println("Enter String : "+str);
    }
}

class Program150
{
    public static void main(String args[])
    {
         StringX sobj = new StringX();
         sobj.Accept();
         sobj.Display();
    }
}