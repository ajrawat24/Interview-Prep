package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicate1 {
    public static void main(String[] arg) {
        int[] arr = {1,2,4,5,3,2,9,5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int no : arr) {
            Integer count = map.get(no);
            if (map.get(no) == null)
            {
                map.put(no, 1);

            }
            else
            {
                count = count + 1;
                map.put(no, count);
            }

        }
        Boolean hasDuplicates1=false;
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if (entry.getValue() > 1)
            {
                System.out.print("duplicates are"+" " +entry.getKey() + " ");
                hasDuplicates1=true;
            }

        }
        if(!hasDuplicates1)
        {
            System.out.println("Array does not have duplicates");
        }


    }
}