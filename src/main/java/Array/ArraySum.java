package Array;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        int avg=0;
        int len = arr.length;
        System.out.println(len);

        for (int i = 0; i < arr.length; i++)
        {
            sum= sum+ arr[i];
            avg= sum/arr.length;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}