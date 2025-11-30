package org.example;

public class FindDuplicateCharacter {

    public static void main(String[] str) {
        String inputString = "hello world";
        StringBuilder sb=new StringBuilder();

        char[] chArray = inputString.toCharArray();

        for (int i = 0; i < chArray.length; i++)
        {
             int index=inputString.indexOf(chArray[i], i+1);

             if (index ==- 1 )
                 {
                 sb.append(chArray[i]);
                 }
        }

        System.out.println(sb.toString());
    }
}
