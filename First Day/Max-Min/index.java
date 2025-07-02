import java.util.Scanner;

public class index
{
    public static void main(String[] args)
    {
        // int[] arr = {1, 3, 5, 2, 8, 4};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Size of the Array: ");
        
        int s = input.nextInt();
        int arr[] = new int[s];

        for (int x = 0; x < s; x++)
        {
            
            System.out.println("Give the "+x+ " index for the array: ");
            int value = input.nextInt();
            arr[x] = value;

        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            else if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("The maximum Number in the given array is: "+max);
        System.out.println("The minimum Number in the given array is: "+min);

    }
}