import java.util.Scanner;

public class index{
    public static void main(String[] args){
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

        System.out.println("Enter the targetted value: ");

        int target = input.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                System.out.println("The index of the Given target value "+target+" is: "+i);
                break;
            }
        }
    }
}