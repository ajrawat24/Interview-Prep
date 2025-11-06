package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {

    public static void main(String[] str)
    {

        String inputString = "Hello";
        StringBuilder s=new StringBuilder();
        char[] ch = inputString.toCharArray();

      //  HashSet<Character> set = new HashSet<Character>();

        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for(int i=0;i<ch.length;i++)
        {
           char c=ch[i];
          // set.add(c);
           if(set.add(c))
           {
               s.append(c);
           }
           else
               System.out.println(c);
        }
        System.out.println(s);

    }
}

