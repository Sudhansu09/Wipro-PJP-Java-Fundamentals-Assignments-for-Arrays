/*
 * Print an array that contains the exact same numbers as the given array,
 * but rearranged so that all the even numbers come before all the odd numbers.
 * Other than that, the numbers can be in any order. You may modify and print the given array,
 * or make a new array.
 * */
class Assignment10
{
	public static void main(String args[])
	{
		int[] arr= {1,0,1,0,0,1,1};
		int[] output = evenOdd(arr);
		for(int i = 0; i < output.length; i++)
		{
			System.out.print(output[i] + " ");
		}
	}
	public static int[] evenOdd(int[] arr)
	{
		int countEven = 0;
		int countOdd= arr.length-1;
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				output[countEven] = arr[i];
				countEven++;
			}
			else
			{
				output[countOdd] = arr[i];
				countOdd--;
			}
		}
		return output;
	}
}