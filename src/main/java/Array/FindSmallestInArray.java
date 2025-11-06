package Array;

public class FindSmallestInArray {
    public static void main(String[] arg)
    {
    int[] array={1,12,13,2,34,0};
    int smallest=array[0];
    for(int i=1; i<=array.length-1; i++) {
        if (smallest > array[i]) {

            smallest = array[i];


        }
    }
    System.out.println(smallest);
}}
