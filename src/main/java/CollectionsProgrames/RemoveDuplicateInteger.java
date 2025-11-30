package CollectionsProgrames;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateInteger {
    public static void main(String[] args) {
        int[] arr= {4,3,2,1,2,1};

       HashSet<Integer> set = new HashSet<Integer>();
        for(int i:arr)
        {
            set.add(i);

        }
        System.out.println(set);
    }
}
