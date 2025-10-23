package Array;

public class FindDuplicatesInteger {

    public static void main(String[] args) {
        int[] arr= {1,2,4,6,3,9,5,};
        Boolean hasDuplicates=false;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    System.out.print(arr[i]+" ");
                    hasDuplicates=true;
                }

                }

            }
        if(!hasDuplicates){
            System.out.println("Array does not have duplicates");

        }

    }
}
