package RandomProgrames;

public class FibonacciSeries1 {
    public static void main(String[] str)
    {
        int number=1;
       int fibonnacciSeries= fibonacciSeries1(number);
       System.out.println(fibonnacciSeries);

    }

    public static int fibonacciSeries1(int number)
    {
         int first=0;
         int second=1;
         int next=0;
        if(number<=1) {
            return number;
        }
                 for(int i=2; i<=number; i++)
                 {
                     next=first+second;
                     first=second;
                     second=next;
                     System.out.println(next);
                 }
                 return next;

    }
}
