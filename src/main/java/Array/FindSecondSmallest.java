package Array;

import java.util.Arrays;

public class FindSecondSmallest {
    public static void main(String[] args) {

        int[] arr = {7, 7, 7, 7, 7, 7, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int smallest = arr[0];
        int secondSmallest = -1;

     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]!=smallest)
         {
             secondSmallest = arr[i];
         }

     }

     if(secondSmallest==-1)
     {
         System.out.println("No smallest element found");
     }
     else
     {
         System.out.println("Second smallest element is "+ secondSmallest);
     }


    }
}
