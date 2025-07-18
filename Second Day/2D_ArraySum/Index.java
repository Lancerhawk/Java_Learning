import java.util.Scanner;

public class Index
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of the 2D Array: ");
        int size = input.nextInt();

        System.out.print("Enter the Length of the inner Array: ");
        int size2 = input.nextInt();

        int[][] arr = new int[size][size2];

        for(int i = 0; i < arr.length ; i++)
        {
            System.out.println("Enter the value for "+i+" Index Elements:");

            for(int j = 0; j <arr[i].length ; j++)
            {
                System.out.print("Enter the value for "+j+" Element: ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Your 2D array is:");
        int full_sum = 0;
        int sum;

        for(int i = 0; i < arr.length ; i++)
        {
            sum = 0; 
            System.out.print("( ");
            for(int j = 0; j <arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+ " ");
                sum = sum + arr[i][j];
            }
            System.out.println(") -> Sum of this row is: "+sum);
            full_sum = full_sum + sum;
        }

        System.out.println("Full sum of the array is(Row Wised): "+full_sum);

        int index1 = 0;
        int index2 = 0;
        full_sum = 0;

        for(int i = 0; i < arr.length ; i++)
        {
            sum = 0;
            sum = arr[index1][index2];

            for(int j = index1 + 1; j < arr.length ; j++)
            {
                sum = sum + arr[j][i];
            }

            System.out.println("The Sum of the "+i+" Column is: "+sum);
            index2++;
            full_sum = full_sum + sum;
        }
        
        System.out.println("The Full Sum of the Array is(Column Wised): "+full_sum);
    }
}