package Array;

public class ReverseArray1 {

    public static void main(String args[]){

        int[] arr= {1,2,3,4,5};
        int[] secondArray= new int[arr.length];
        int index=0;
        for(int i=arr.length-1;i>=0;i--){

            secondArray[index]= arr[i];
            index= index+1;
        }
        for(int no: secondArray){

            System.out.print(no+" ");
        }
    }
}
