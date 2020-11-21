/*Program to initialize integer array with ascii values and print the corresponding
 *character vaues in an single row
 * */
class Assignment4
{
	public static void main(String args[])
	{
		int[] arr=new int[]{65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((char)arr[i]+"  ");
		}
	}
}