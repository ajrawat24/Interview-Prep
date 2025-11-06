package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] str){
       /* int[] a= {1,2,3,4,5,6,7,8};*/
        int[] arr = {1, 2, 4, 5, 3, 2, 9, 5};
        Map<Integer,Integer> map=new HashMap<>();
        // First we have to prepare the map
        // if each element of array get from map if null asign key as array element and value 1
        // if element already present increase the counter and put in the map
        // now map is ready with key and value
        for(int no:arr)
        {
            Integer count=map.get(no);
            if(count==null) {
                map.put(no, 1);
            }
            else {
                count=count+1;
                map.put(no, count);
            }

        }

        //Each pair (key, value) is represented as an object of type Map.Entry<K, V>.
        //entrySet() returns a Set of all these key–value pairs.
        //You can think of Map.Entry as a mini-object holding one key and its corresponding value.
        //  get the key if value is greater than 1 and that will be the duplicate value
        // if code goes to if block, the hasDuplicate will alway return true else false
        // (i.e no duplicate items in the array)

        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        {
            Boolean hasDuplicates=false;
            for(Map.Entry<Integer,Integer> entry:entrySet){
                if(entry.getValue()>1){
                    System.out.println("duplicate integervalue in the array"+"=" +entry.getKey());
                    hasDuplicates=true;
                }

                }
            if(!hasDuplicates) {
                System.out.println("There is no duplicate value in the array");
            }
        }
    }
}
