package org.example;

public class ReverseLetter {
    public static void main(String[] args) {
        // reverse only letters
        String inputString="h5e311&o";
        char[] chArray=inputString.toCharArray();
        int left=0;
        int right=inputString.length()-1;

        while(left<right){

            if(!Character.isLetter(chArray[left])){
                left++;
                continue;

            }
            if(!Character.isLetter(chArray[right])){
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
