package CollectionsProgrames;

import java.util.HashSet;

public class LogestSubstring {

    public static void main(String[] str)
    {
        String s= "abcdef";

        int left=0;
        int right=0;
        int MaxLength=0;

        HashSet<Character> Charset=new HashSet<>();
        while(Charset.contains(s.charAt(right)))
        {
            Charset.remove(s.charAt(left));
            left++;
        }


        for(right=0; right < s.length();right++)
        {
            Charset.add(s.charAt(right));

        }

        MaxLength=Math.max(MaxLength, right-left+1);
        System.out.println(MaxLength);

    }
}
