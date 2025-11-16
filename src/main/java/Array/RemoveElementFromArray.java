package Array;
public class RemoveElementFromArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int numToRemove = 3;

        int[] updatedArray = removeNumber(arr, numToRemove);

        for (int x : updatedArray) {
            System.out.print(x + " ");
        }
    }

    public static int[] removeNumber(int[] arr, int num) {

        // Step 1: Count how many times the number appears
      int count= 0;
      for(int i=0;i<arr.length-1;i++)
      {
          if(arr[i]==num)
          {
              count=count+1;
          }
      }

        // Step 2: Create new array with reduced size
        int[] newArray = new int[arr.length-count];

        // Step 3: Copy all values except the number to remove
        int index=0;
        for(int x: arr)
        {
            if(x!=num) {
                newArray[index] = x;
                index=index+1;
            }
        }

        return newArray;
    }
}
