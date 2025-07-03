import java.util.Scanner;

public class Index
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Provide the Array Size: ");
        int s = input.nextInt();

        int arr[] = new int[s];

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter the Value for " +i+ " Index: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the Sum Value: ");
        int sum = input.nextInt();


        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == sum)
                {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}