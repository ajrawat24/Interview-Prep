package CollectionsProgrames;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {


// Online Java Compiler
// Use this editor to write, compile and run your Java code online


    public static void main(String[] args) {

        String s="pwwkewxpw";
        int LongestLengthSubstring= findLengthOfLongestSubstrin(s);
        System.out.println(LongestLengthSubstring);

    }

    public static int findLengthOfLongestSubstrin(String s)
    {
        int left=0;
        int maxLength=0;
        Set<Character> charset= new HashSet<>();
        for(int right=0; right < s.length() ; right++)
        {
            while(charset.contains(s.charAt(right)))
            {
                charset.remove(s.charAt(left));
                left++;
            }

            charset.add(s.charAt(right));
            maxLength= Math.max(maxLength, right- left+1);

        }
        return maxLength;


    }
}
