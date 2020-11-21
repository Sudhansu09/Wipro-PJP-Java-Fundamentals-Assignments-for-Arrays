/**
 * Program to find the largest 2 numbers and the smallest 2 numbers in the given array
 */
import java.util.Arrays;
class Assignment5
{
	public static void main(String args[])
	{
		int[] arr=new int[]{102,201,9,95,12,45,109,4,34,56,7};
		Arrays.sort(arr);
		
		System.out.println("Smallest two in the array: "+arr[0]+" and "+arr[1]);
		System.out.println("Largest two in the array: "+arr[arr.length-1]+" and "+arr[arr.length-2]);
	}
}