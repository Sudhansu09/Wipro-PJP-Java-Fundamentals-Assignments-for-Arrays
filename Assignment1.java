//Program to print the sum and average of array
class Assignment1
{
	public static void main(String args[])
	{
		int[] arr=new int[]{4,9,11,36,57,89,15,51,37,21};
		int sum=0;
		float avg;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum :"+sum);
		avg=sum/arr.length;
		System.out.println("Average :"+avg);
	}
}