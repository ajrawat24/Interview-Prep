package org.example;

public class ReverseOnlyVowel {
    public static void main (String[] args)
    {
        String inputString="helloworld";
        char[] charArray = inputString.toCharArray();
        int left =0;
        int right = charArray.length-1;

        while(left<right)
        {
            if(!isVowel(charArray[left]))
            {
                left++;
                continue;

            }
            if(!isVowel(charArray[right]))
            {
                right--;
                continue;

            }
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;


        }
        System.out.println(new String(charArray));


    }

    public static Boolean isVowel(char ch)
    {

        return ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u';
    }
}
