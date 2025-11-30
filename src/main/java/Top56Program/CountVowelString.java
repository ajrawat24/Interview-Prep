package Top56Program;

import java.util.*;

public class CountVowelString {
    public static void main(String[] args)
    {
        String s= "hello world";

        int count=0;

        for(int i=0; i<s.length(); i++)
        {

            if(isVowel(s.charAt(i)))
            {

                count ++;
            }

        }

        System.out.println(count);
    }

    public static boolean isVowel(char ch)

    {

        return ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e';
    }
}







