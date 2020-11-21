/**
 *  Write a program to initialize an integer array with values and check if a given number
 *  is present in the array or not. If the number is not found, it will print -1 else it will
 *  print the index value of the given  number in the array
 */
import java.util.Scanner;
class Assignment3
{
	public static void main(String args[])
	{
		int[] arr=new int[]{0,9,8,7,6,5,4,3,2,1};
		int num;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number to search :");
		num=input.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.print("Element found at index : "+i);
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("-1");
		}
	}
}