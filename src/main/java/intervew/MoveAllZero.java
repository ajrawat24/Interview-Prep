package intervew;

import java.util.Arrays;

public class MoveAllZero {
    public static void main(String[] args) {

        int[] arr={1,2,0,00,9,000,56};
        System.out.println(Arrays.toString(arr));

        int left=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0){
                arr[left]=arr[i];
                left++;
            }

        }
        while (left<arr.length)
        {
            arr[left]=0;
            left++;

        }

      System.out.println(Arrays.toString(arr));


    }
}
