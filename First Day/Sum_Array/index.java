import java.util.Scanner;

public class index{
    public static void main(String[] args)
    {
        // int[] arr = {1, 4, 2, 3, 5};
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
        
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        System.out.println("The sum of all the numbers in the array is: "+sum);
    }
}