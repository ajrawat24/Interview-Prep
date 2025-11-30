package Array;

public class FindLargestNumber {
    public static void main(String[] args) {

        int[] arr= {2,4,9,4,9,13,0,2};

        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){

                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
