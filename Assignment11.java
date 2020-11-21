/*
 * Given an array of type int, print true if every element is 1 or 4
 * */
class Assignment11
{
	public static void main(String args[])
	{
		int[] arr= {1,4,1,4};
		System.out.print(only14(arr));
	}
	public static boolean only14(int[] nums)
	{
		boolean bool = true;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] != 1 && nums[i] != 4)
			{
				bool = false;
			}
		}
		return bool;
	}
}