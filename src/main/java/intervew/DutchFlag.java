package intervew;

import java.util.Arrays;

public class DutchFlag {
  public static void main(String[] str) {
      int[] nums = {2, 0, 0, 1, 1, 1, 2, 2};
      int start = 0;
      int mid = 0;
      int end = nums.length - 1;

      while (mid <= end) {

          switch (nums[mid]) {

              case 0:
                  swap(nums, start, mid);
                  start++;
                  mid++;
                  break;

              case 1:
                  mid++;
                  break;

              case 2:
                  swap(nums, mid, end);
                  end--;
                  break;
          }
      }
      System.out.println(Arrays.toString(nums));

  }
    public static void swap ( int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}