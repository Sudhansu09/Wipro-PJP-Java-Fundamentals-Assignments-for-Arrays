//Program to find Maximum and Minimum value
import java.util.Scanner;
class Assignment2
{
	public static void main(String args[])
	{
		int[] arr=new int[10];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array elements(Upto 10) :");
		for(int i=0;i<10;i++)
		{
			arr[i]=input.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum Value :"+max);
		System.out.print("Minimum Value :"+min);
	}
}