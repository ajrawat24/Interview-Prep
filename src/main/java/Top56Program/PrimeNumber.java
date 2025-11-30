package Top56Program;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args)
    {

        int num=2;
        boolean isPrime=true;
        for(int i=2; i<=num/2; i++)
        {
            if(num%2==0)
            {
                isPrime=false;
            }
        }

        if(isPrime)
        {
            System.out.println(isPrime);
        }
        else
        {
            System.out.println(isPrime);
        }

    }
}






