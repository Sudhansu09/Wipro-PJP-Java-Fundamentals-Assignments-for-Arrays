/**
 * Program to remove the duplicate elements in an array and print the same
 */
class Assignment7
{
    public static void main(String args[]) 
    {
        int arr[] = {9,4,7,6,5,2,4,5,9};
        int l = arr.length;
        for (int i = 0; i < arr.length; i++) 
        {
            boolean flag = false;
            for (int j = 0; j < i; j++)
            {
                if (arr[i] == arr[j])
                {
                    flag = true;
                }
            }
            if (flag)
            {
                for (int j = i; j < arr.length-1; j++) 
                {
                    arr[i] = arr[i+1];
                }
                l--;
            }
        }

        for (int i = 0; i < l; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}