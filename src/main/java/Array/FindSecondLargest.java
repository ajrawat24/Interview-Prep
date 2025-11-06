package Array;

import java.util.Arrays;

public class FindSecondLargest {
    public static void main(String args[])
    {
        int[] arr={15,15,15,150,16,15,15};
        Arrays.sort(arr);
        int largestElement=arr[arr.length-1];
        int secondLargestElement=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=largestElement)
            {
                secondLargestElement=arr[i];
                break;
            }
        }
        if(secondLargestElement==-1)
        {
            System.out.println("Largest Element not found");
        }
        else
        {

            System.out.println("Second Largest Element found" + secondLargestElement);
        }


    }

}
