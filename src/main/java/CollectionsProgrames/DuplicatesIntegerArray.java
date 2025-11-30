package CollectionsProgrames;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesIntegerArray

{
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


        public static void main(String[] args) {
            System.out.println("Find the duplicate element from array");
            int[] arr= {1,9,2,3,4,6,7};

            HashMap<Integer, Integer> map= new HashMap<> ();

            for(int num: arr)
            {
                Integer count= map.get(num);
                if(count==null)
                {
                    map.put(num,1);
                }
                else
                {
                    count = count+1;
                    map.put(num, count);
                }
                System.out.println(map);

            }

            Set< Map.Entry<Integer, Integer>> entrySet=map.entrySet();
            boolean hasDuplicates= false;
            for(Map.Entry<Integer, Integer> entry:entrySet)
            {
                if (entry.getValue()>1)
                {
                    System.out.println("Duplicates number are"+entry.getKey());
                    hasDuplicates=true;
                }
            }

            if(!hasDuplicates)
            {
                System.out.println("There are no Duplicates number present in the array");
            }

        }
    }

