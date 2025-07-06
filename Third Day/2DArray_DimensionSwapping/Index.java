import java.util.Scanner;

public class Index 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] original = new int[rows][cols];

        System.out.println("Enter elements for the " + rows + "x" + cols + " array:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                original[i][j] = input.nextInt();
            }
        }

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                transposed[j][i] = original[i][j];
            }
        }

        System.out.println("\nOriginal " + rows + "x" + cols + " Array:");
        printMatrix(original);

        System.out.println("\nTransposed " + cols + "x" + rows + " Array:");
        printMatrix(transposed);
    }

    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int value : row) 
            {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
