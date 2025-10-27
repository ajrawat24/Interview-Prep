package String;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagrams {

    /* function to check whether two strings are
    anagram of each other */
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lenghts of both strings
        int n1 = str1.length;
        int n2 = str2.length;
        // If length of both strings is not same,
        // then they cannot be anagram
        if(n1!=n2)
        {
            return false;
        }

        // Sort both strings

        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i<n1;i++)
        {
            if(str1[i]==str2[i])
            {
                return true;
            }

        }
        return false;
        // Compare sorted strings

    }

    /* Driver program to test to print printDups*/
    public static void main(String[] args)
    {

        String inputString1 = "listen";
        String inputString2 = "silent";


        if(areAnagram(inputString1.toCharArray(), inputString2.toCharArray())){

            System.out.println("Anagrams found");

        }
        else{
            System.out.println("Anagrams not found");
        }

    }
}



