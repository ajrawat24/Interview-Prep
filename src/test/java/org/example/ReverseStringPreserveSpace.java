package org.example;

public class ReverseStringPreserveSpace {

    public static void main(String[] str)
    {
        String inputString="Java is a programming language";
        char[] chArray = inputString.toCharArray();
        int left=0;
        int right=inputString.length()-1;
        while(left<right)
        {
            if(chArray[left]==' ')
            {
                left++;
                continue;
            }
            if(chArray[right]==' ')
            {
                right--;
                continue;
            }

            char temp=chArray[left];
            chArray[left]=chArray[right];
            chArray[right]=temp;
            left++;
            right--;

        }

        System.out.println(new String(chArray));

    }
}
