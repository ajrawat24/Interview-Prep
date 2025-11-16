package StringInterview;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class MoveAllZero {
    public static void main(String[] args) {
        int[] arr={1,3,00,000,45,90};
        int left=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                arr[left]=arr[i];
                left++;

            }
        }
        while (left< arr.length)
        {
            arr[left]=0;
            left++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
