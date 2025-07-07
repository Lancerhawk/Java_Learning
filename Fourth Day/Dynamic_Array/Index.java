import java.util.ArrayList;

public class Index
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(3);
        arr.add(2);
        arr.add(2);
        arr.add(2, 10);
        arr.remove(2);
        arr.remove(3);


        for(int i = 0 ; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
}