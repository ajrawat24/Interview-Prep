package String;

import java.util.Arrays;

public class EasyReverseWithoutMovingSpace {

    public static void main(String[] args) {

        String inputString= "I am XYZ";
        char[] input=inputString.toCharArray();

        char[] letters= inputString.replace(" ", "").toCharArray();

        int left=0;
        int right=letters.length-1;
        while(left<right)
        {
            char temp=letters[left];
            letters[left]=letters[right];
            letters[right]=temp;
            left++;
            right--;
        }
        int index=0;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]!=' ')
            {
                input[i]=letters[index];
                index++;

            }
        }
        System.out.println(new String(input));





    }
}
