package CollectionsProgrames;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDup {

    public static void main(String[] args) {

        int[] arr={1,2,5,4,0,7,7,7,5,7};
        Map<Integer, Integer> map= new HashMap<>();

        for(int no: arr)
        {
            Integer count= map.get(no);

            if (count==null)
            {
                map.put(no,1);

            }
            else {
                count =count+1;
                map.put(no,count);
            }

        }

        Set<Map.Entry<Integer, Integer>> entrySet= map.entrySet();

        for( Map.Entry<Integer, Integer> entry: entrySet)
        {

            if (entry.getValue()>1)
            {
                    System.out.println(entry.getKey());
            }
        }
    }
}
