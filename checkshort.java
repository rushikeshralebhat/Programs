import java.util.*;

class Sorting
{
	public boolean BubbleSort(int Arr[],int no)
	{
		int i = 0, j = 0, temp = 0;
		int size = Arr.length;

		for(i = 0; i < size; i++)
		{
			for(j = 0; j < size - i - 1; j++)
			{
				if(Arr[j] > Arr[j+1])
				{
					while(Arr[j]==no)
					{
						break;
					}
					temp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = temp;
				}	
			}
		}
		if(i==Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class Program257
{
	public static void main(String arr[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();

		int Arr[] = new int[size];

		System.out.println("Enter the elements");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
        
        System.out.println("Enter the serach number");
        int value = sobj.nextInt();
		
		Sorting obj = new Sorting();
		boolean bret = obj.BubbleSort(Arr,value);
		if(bret = true)
		{
			System.out.println("element is there");
		}
		else
		{
			System.out.println("element is not there");
		}
	}
}