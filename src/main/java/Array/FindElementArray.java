package Array;

public class FindElementArray {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7};
        int elementToSearch = -1;
        boolean found = false;   // flag to track if element is found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                System.out.println("Element " + elementToSearch + " found at index: " + i);
                found = true;
                break; // stop searching once found
            }
        }

        if (!found) {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }
    }
}
