package CollectionsProgrames;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccuranceOfEachWord {
    public static void main(String[] str) {
        String inputString = "I love Java and I love coding";
        String[] strArray = inputString.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : strArray) {
                Integer count =map.get(word);
            if(count==null)
            {
                map.put(word, 1);

            }
            else
            {
                count =count+1;
                map.put(word, count);
            }

        }

        Set< Map.Entry<String, Integer>> entrySet= map.entrySet();

        for(Map.Entry<String, Integer> entry:entrySet)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}