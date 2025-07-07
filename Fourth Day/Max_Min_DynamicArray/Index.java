import java.util.ArrayList;
import java.util.Scanner;

public class Index
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int add;
        Scanner input = new Scanner(System.in);

        System.out.println("How much Elements you want to store in array?");
        int size = input.nextInt();
        
        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter the element for Index ["+i+"]: ");
            add = input.nextInt();
            arr.add(add);
        }
        int max = arr.get(0), min = arr.get(0);

        System.out.print("The Array Elements are: ");
        for(int var : arr){
            System.out.print(var+" ");

            if(max < var){
                max = var;
            }
            if(min > var){
                min = var;
            }            
        }
        System.out.println();

        System.out.print("These Numbers are Even Numbers inside this Array: ");
        for(int i = 0; i < arr.size() ; i++)
        {
            if(arr.get(i) % 2 == 0)
            {
                System.out.print(arr.get(i)+" ");
            }
            
        }
        System.out.println();


        System.out.print("These Numbers are Odd Numbers inside this Array: ");
        for(int i = 0; i < arr.size() ; i++)
        {
            if(arr.get(i) % 2 != 0)
            {
                System.out.print(arr.get(i)+" ");
            }   
        }
        System.out.println();

        System.out.println("The Max in the array is: "+max);
        System.out.println("The Min in the array is: "+min);
    }
}