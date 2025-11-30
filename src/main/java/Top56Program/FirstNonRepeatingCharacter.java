package Top56Program;
import java.util.*;

public class FirstNonRepeatingCharacter {
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

        for(char c: ch)
        {
            if(freq[c] == 1)
            {
                System.out.println(c );
                break;
            }
        }
    }

}





