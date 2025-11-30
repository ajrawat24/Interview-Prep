package Top56Program;
import java.util.*;

public class CountDigitNumber {
    public static void main(String[] args)
    {
        int num= 1;

        int count=0;

        while(num!=0)
        {

            num=num/10;
            System.out.println(num);
            count++;
        }
        System.out.println(count);
    }

}






