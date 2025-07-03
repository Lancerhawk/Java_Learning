import java.util.Scanner;

public class Index
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What should be the size of the first Array?");
        int size_array1 = input.nextInt();

        int[] arr1 = new int[size_array1];

        for(int i = 0; i < arr1.length ; i++)
        {
            System.out.println("Enter the Value of first array " +i+ " Element: ");
            arr1[i] = input.nextInt();
        }

        System.out.println("What should be the size of the second Array?");
        int size_array2 = input.nextInt();

        int[] arr2 = new int[size_array2];

        for(int i = 0; i < arr2.length ; i++)
        {
            System.out.println("Enter the Value of second array " +i+ " Element: ");
            arr2[i] = input.nextInt();
        }

        System.out.print("The values of the first Array is: ");
        for(int i = 0; i < arr1.length ; i++)
        {
            System.out.print(arr1[i]+ " ");
        }
        System.out.println(" ");
        
        System.out.print("The values of the second Array is: ");
        for(int i = 0; i < arr2.length ; i++)
        {
            System.out.print(arr2[i]+ " ");
        }
        System.out.println(" ");

        int sum = 0;

        if(arr1.length == arr2.length)
        {
            for(int i = 0; i < arr1.length; i++)
            {
                sum = sum + arr1[i] + arr2[i];
            }
        }
        else if(arr1.length < arr2.length)
        {    
            for(int i = 0 ; i < arr2.length ; i++)
            {
                if(i == arr1.length)
                {
                    sum = sum + arr2[i];
                }
                else
                {
                    sum = sum + arr1[i] + arr2[i];   
                }

            }    
        }
        else
        {
            for(int i = 0 ; i < arr1.length ; i++)
            {
                if(i == arr2.length)
                {
                    sum = sum + arr1[i];
                }
                else
                {
                    sum = sum + arr1[i] + arr2[i];   
                }

            }
        }    


        System.out.println("The sum of both the arrays elements is: "+sum);

        if(arr1.length == arr2.length)
        {
            int[] arr3 = new int[size_array1];
            
            for(int i = 0; i < arr1.length; i++)
            {
                arr3[i] = arr1[i] + arr2[i];
            }

            System.out.print("The values of the Third Array is:");
            
            for(int i = 0; i < arr3.length ; i++)
            {
                System.out.print(" "+arr3[i]+" ");
            }
        }
        
    }
}