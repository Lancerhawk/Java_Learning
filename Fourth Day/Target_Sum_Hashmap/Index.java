import java.util.HashMap;
import java.util.Scanner;

public class Index{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        int sum = 0;
        System.out.println("Provide a size for the HashMap: ");
        int size = input.nextInt();
        int Value = 0;
        String str;

        for(int i = 0; i < size; i++){
            System.out.println("Enter the Key of the Index ["+i+"] : ");
            str = input.next();
            System.out.println("Enter the value of the Index ["+i+"] : ");
            Value = input.nextInt();
            
            map.put(str, Value);
        }

        System.out.println(map);

        int sum = 0;
        int sum_needed = 0;
        System.out.println("Enter the Target Sum needed to be found: ");
        sum_needed = input.nextInt();

        for(int i = 0; i < HashMap.size(); i++){
            for(int j = i + 1; j < HashMap.size(); i++){
                
            }
        }



    }
}