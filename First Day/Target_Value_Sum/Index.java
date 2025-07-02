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
            int value = input.nextInt();
        
            arr[i] = value;
        }

        System.out.println("Enter the Sum Value: ");
        int sum = input.nextInt();

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                int check = arr[i] + arr[j];

                if(check == sum)
                {

                    if(arr[i] != arr[j])
                    {
                        System.out.println(arr[i]+", "+arr[j]);
                    }
                }
            }
        }
    }
}