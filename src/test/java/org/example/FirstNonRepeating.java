package org.example;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String inputString = "hello world";
        char[] charArray = inputString.toCharArray();

        int[] freq = new int[265];
        for (char ch : charArray)
        {
          freq[ch]=freq[ch]+1;
            if(freq[ch]==1)
            {
                System.out.print(ch);
                break;

            }

        }

    }
}

