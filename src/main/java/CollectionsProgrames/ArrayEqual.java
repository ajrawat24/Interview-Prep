package CollectionsProgrames;

import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] str)
    {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));

    }
}
