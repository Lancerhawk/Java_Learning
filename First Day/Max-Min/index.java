public class index
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 2, 8, 4};

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