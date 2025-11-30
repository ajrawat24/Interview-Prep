package CollectionsProgrames;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringCharacter {

    public static void main(String[] str)
    {
        String inputString="aaaabbccddeeee";

        char[] ch=inputString.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        for(char c:ch)
        {
            Integer count=map.get(c);
            if(count==null)
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,count+1);
                count++;
            }
        }
        System.out.println(map);
        char maxChar = ' ';
        int max = 0;
        for(Map.Entry<Character, Integer> entry:map.entrySet())
        {

            if(entry.getValue()>max)
            {
                max=entry.getValue();
                maxChar=entry.getKey();

            }

        }
        System.out.println(maxChar +"====="+ max);
    }
}
