package Top56Program;
import java.util.*;

public class MoveAllZeroToEnd {
    public static void main(String[] args)
    {
        int[] a= {0,1,0,3,12};

        int left=0;

        for(int i=0; i< a.length; i++)
        {

            if(a[i]!=0)
            {

                a[left]=a[i];
                left++;

            }
        }

        while (left< a.length)
        {

            a[left]=0;
            left++;
        }

        for(int i=0; i< a.length; i++)
        {
            System.out.println(a[i]);
        }




    }
}






