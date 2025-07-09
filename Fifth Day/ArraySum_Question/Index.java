import java.util.TreeSet;
import java.util.ArrayList;

public class Index {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>();

        int[] nums1 = {2,2,4,4};
        int[] nums2 = {2, 2, 2, 4, 4};
        
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            set.add(num);
        }

        System.out.println(set);
        ArrayList<Integer> arr = new ArrayList<>(set);

        int size = arr.size();
        if(nums1.length + nums2.length % 2 == 0)
        {
            int mid = size / 2;
            double median = (arr.get(mid - 1) + arr.get(mid)) / 2.0;
            System.out.println(median);
        }
        else if(nums1.length + nums2.length % 2 != 0)
        {
            System.out.println(arr.get(size / 2) / 2.0);
        }
    }
}