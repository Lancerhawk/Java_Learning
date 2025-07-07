import java.util.HashSet;

public class Index{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        //Set doesn't take any duplicated Values
        set.add("Hello World");
        set.add("Hello World");
        set.add("Hi amigo");

        System.out.println(set);
    }
}