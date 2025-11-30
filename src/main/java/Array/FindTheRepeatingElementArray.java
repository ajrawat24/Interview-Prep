package Array;

public class FindTheRepeatingElementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    System.out.print("repeating element in array are"+ "== "+ arr[i]+" ");
                }


            }

        }

    }
}
