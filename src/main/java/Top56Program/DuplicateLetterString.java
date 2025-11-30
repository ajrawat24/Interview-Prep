package Top56Program;

import java.util.*;

public class DuplicateLetterString {
    public static void main(String[] args) {
        System.out.println("Write a java program to print a duplicate letter from a string");

        String s= "hheelloo";
        StringBuilder sb= new StringBuilder();
        char[] ch= s.toCharArray();
        for(int i=0; i<s.length(); i++)
        {

            int count= s.indexOf(ch[i], i+1);

            System.out.println(count);

            if(count>-1)
            {
                sb.append(ch[i]);
            }
        }

        System.out.println(sb);
    }
}
