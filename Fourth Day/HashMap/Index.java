import java.util.HashMap;

public class Index
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        String letter = "Programminggggggg";

        for(char c : letter.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println(map);
    }
}