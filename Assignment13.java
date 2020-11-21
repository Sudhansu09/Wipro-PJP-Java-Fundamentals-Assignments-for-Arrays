/**
 *  Program to reverse the elements of a given 2*2 array.
 *  Four integer numbers needs to be passed as Command Line arguments.
 */

class Assignment13
{
    public static void main(String args[])
    {
        if (args.length != 4)
        {
            System.out.println("Please enter 4 integer numbers");
        }
        else 
        {
            int arr[][] = new int[2][2];
            for (int i = 0, k = 0; i < 2; i++)
            {
                for (int j = 0; j < 2; j++, k++)
                {
                    arr[i][j] = Integer.parseInt(args[k]);
                }
            }

            System.out.println("The given array is :");
            //Printing all elements of given array
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            //Reversing Rows of the array
            for (int i = 0; i < 2; i++)
            {
                int tmp = arr[0][i];
                arr[0][i] = arr[1][i];
                arr[1][i] = tmp;
            }

            //Reversing columns of the array
            for (int i = 0; i < 2; i++)
            {
                int tmp = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = tmp;
            }

            //Printing all elements of reversed array
            System.out.println("The reverse of the array is :");
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}