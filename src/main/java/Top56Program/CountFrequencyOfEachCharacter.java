package Top56Program;
import java.util.*;

public class CountFrequencyOfEachCharacter {
    public static void main(String[] args)
    {

        String s1="hello world";

        String s= s1.replaceAll(" ", "");

        int[] freq= new int[256];
        char[] ch= s.toCharArray();
        for(int i=0; i<s.length(); i++)
        {

            freq[ch[i]]++;

        }

        for(int i=0; i< freq.length; i++)
        {
            if(freq[i] > 0)
            {
                System.out.println((char)i +"==" + freq[i]);
            }
        }
    }

}





