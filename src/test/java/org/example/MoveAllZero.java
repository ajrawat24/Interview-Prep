package org.example;

public class MoveAllZero {
    public static void main(String[] str)
    {
        int[] myArray={2,5,0,4,2,7,0,0,1,9,4};
        int left=0;
        int right=myArray.length-1;

        for(int i=0;i<myArray.length;i++)
        {
            if(myArray[i]!=0)
            {
                myArray[left]= myArray[i];
                left++;
            }
        }
        while(left<= right)
        {
            myArray[left]= 0;
            left ++;
        }
   for(int i=0;i<myArray.length;i++)
    {
        System.out.print(myArray[i]+",");
    }
    }
}
