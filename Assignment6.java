/**
 * Program to initialize an array and print them in a sorted order
 */
import java.util.Arrays;
class Assignment6
{
	public static void main(String args[])
	{
		int[] arr=new int[]{102,201,9,95,12,45,109,4,34,56,7};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
	}
}