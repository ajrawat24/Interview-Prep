package CollectionsProgrames;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FirstNonRepeating {
    public static void main(String[] args) {

        String str = "swiss";
        char[] ch=str.toCharArray();

        HashMap<Character, Integer> map=new HashMap<>();

        for(char c: ch)
        {
            Integer i=map.get(c);
            if(i==null)
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,i+1);
            }
        }
        System.out.println(map);

       Set<Map.Entry<Character, Integer>> entrySet= map.entrySet();

   for(Map.Entry<Character, Integer> entry: entrySet)
   {
       if(entry.getValue()==1)
       {
           System.out.println("first non repeating character======="+entry.getKey());
           break;
       }
   }
    }
}
