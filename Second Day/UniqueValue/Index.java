import java.util.Scanner;

public class Index{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Arrays: ");
        int size = input.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];


        for(int i = 0; i < size ; i++)
        {
            System.out.println("Enter the value of First Array "+i+" Element: ");
            arr1[i] = input.nextInt();

            System.out.println("Enter the value of Second Array "+i+" Element: ");
            arr2[i] = input.nextInt();
        }

        int j = 0;
        int[] arr3 = new int[ 2 * size];

        for(int i = 0; i < size; i++)
        {
            arr3[j] = arr1[i];
            j++;
        }
        for(int i = 0; i < size; i++)
        {
            arr3[j] = arr2[i];
            j++;
        }

        int max = arr3[0]; int min = arr3[0];
        for(int i = 0; i < arr3.length ; i++){
            if(arr3[i] > max)
            {
                max = arr3[i];
            }
            else if(arr3[i] < min)
            {
                min = arr3[i];
            }
        }

        System.out.print("The value of the Third array was: ");
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i]+ " ");
        }
        System.out.println("");
        System.out.println("Maximum Value is: "+max);
        System.out.println("Minimum Value is: "+min);

        
    }


}