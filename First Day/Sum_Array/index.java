public class index{
    public static void main(String[] args){
        int[] arr = {1, 4, 2, 3, 5};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }


        System.out.println("The sum of all the numbers in the array is: "+sum);
    }
}