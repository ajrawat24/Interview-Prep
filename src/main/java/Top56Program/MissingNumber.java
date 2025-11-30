package Top56Program;
public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int n= arr.length+1;

        int expectedSum= n*(n+1)/2;

        int actualsum=0;

        for(int i=0; i<arr.length; i++)
        {
            actualsum=actualsum+ arr[i];
        }

        int missingNumber= expectedSum-actualsum;

        System.out.println(missingNumber);
    }

}