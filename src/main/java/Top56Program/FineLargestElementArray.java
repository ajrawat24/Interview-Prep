package Top56Program;



import java.util.*;

public class FineLargestElementArray {
    public static void main(String[] args)
    {

        System.out.println("Find the largestElement of an Array");
        int[] a= {10,5,20,3,8};

        int largest=a[0];

        for(int i=0; i <a.length; i++)
        {

            if(a[i]> largest)
            {
                largest= a[i];

            }

        }

        System.out.println(largest);

    }
}






