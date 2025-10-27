package Array;

public class FindDuplicates1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,9};
        Boolean hasDuplicate=false;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] & i!=j)
                {
                    System.out.println(arr[i]+" is duplicated");
                    hasDuplicate=true;
                }

            }

        }
        if(!hasDuplicate){
            System.out.println("No duplicates found");
        }


    }
}
