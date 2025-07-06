import java.util.Scanner;

public class Index 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print("Enter value for position [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (arr[i][j] > max) 
                {
                    max = arr[i][j];
                } 
                if (arr[i][j] < min) 
                {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("The maximum number in the 2D array is: " + max);
        System.out.println("The minimum number in the 2D array is: " + min);
    }
}
