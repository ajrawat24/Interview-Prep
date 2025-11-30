package Array;

import java.util.HashMap;

public class CountFrequencyOfArrayElement {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int no: arr)
        {
            Integer count = map.get(no);

            if(count==null)
            {
                map.put(no,1);
            }
            else
            {
                count =count +1;
                map.put(no,count);
            }

        }

        System.out.println(map);


    }
}
