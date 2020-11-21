/*
 * Print a version of the given array where all the 10's have been removed.
 * The remaining elements should shift left towards the start of the array as needed,
 * and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
 * You may modify and display the given array or make a new array.
 * */
class Assignment9
{
	public static void main(String args[])
	{
		int[] arr= {1,10,10,2};
		int[] output = withoutTen(arr);
		for(int i = 0; i < output.length; i++)
		{
			System.out.print(output[i] + " ");
		}
	}
	public static int[] withoutTen(int[] arr)
	{
		int[] result = new int[arr.length];
		int j = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 10)
			{
			}
			else 
			{
				result[j] = arr[i];
				j++;
			}
		} 
		for(int i = j; i < arr.length; i++)
		{
			result[i] = 0;
		}
		 return result;
	}
}