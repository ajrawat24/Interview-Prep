package MostImportantProgram;

public class MoveAllZeroRight {
    public static void main(String[] args) {


        int[] arr = {1, 0, 2, 00, 5, 000, 7, 0};
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[left] = arr[i];
                left++;
            }
        }
        while (left < arr.length) {
            arr[left] = 0;
            left++;
        }

        for (int n : arr) {
            System.out.print(n + " ");

        }
    }
}
