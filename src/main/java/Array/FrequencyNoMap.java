package Array;

import java.util.Arrays;

public class FrequencyNoMap {
    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 5, 2, 5, 4, 3, 4};

        //Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j] && i!=j)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            }


        int[] arr1= {2,2,3,3,4,4,5,5,5};
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int count = 1;  // count of current element

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " → " + count);
                count = 1; // reset count for next element
            }
        }

        // Print last element
        System.out.println(arr[arr.length - 1] + " → " + count);
    }
}
