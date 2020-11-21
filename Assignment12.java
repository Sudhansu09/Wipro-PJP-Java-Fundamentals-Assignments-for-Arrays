/*
 * Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.
 * */
class Assignment12
{
	public static void main(String args[])
	{
		int[] arr1={7,7,7};
		int[] arr2={3,8,0};
		int[] output=middleWay(arr1,arr2);
		for(int i = 0; i < output.length; i++)
		{
			System.out.print(output[i] + " ");
		}
	}
	public static int[] middleWay(int[] a, int[] b)
	{
		int[] output={a[1], b[1]};
		return output;
	}
}