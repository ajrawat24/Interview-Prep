package Top56Program;
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        int num=5;
        int first = 0;
        int second=1;
        int next=0;

        for(int i=0; i<num; i++)
        {

            next= first + second;
            first=second;
            second=next;

            System.out.println(next);
        }

    }

}






