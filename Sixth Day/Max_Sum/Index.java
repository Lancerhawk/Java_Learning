import java.util.Scanner;

public class Index 
{
    static public int maxSubArray(int[] nums) 
    {
        int result = nums[0];
        int max_element = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
           
           max_element = Math.max(max_element + nums[i], nums[i]);

           result = Math.max(max_element, result);
        
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int size = input.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i < nums.length ; i++)
        {
            System.out.println("Enter the value of index ["+i+"]: ");
            nums[i] = input.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("The Maximum number of SubArray sum is: "+result);
    }
}