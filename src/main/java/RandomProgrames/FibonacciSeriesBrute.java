package RandomProgrames;

public class FibonacciSeriesBrute {
    public static void main(String[] str) {

       int first=1;
       int second=0;
       int next;

       int howManyNumber=6;

        // We have f(1)=F(1)+F(0)= 1+0=1
        // f(2)= f(1)+ f(2)
        // f(3)=f(2)+f(3);
        for (int i = 2; i <= 6; i++)
        {
                next = first + second;
                System.out.println(next);
                first=second;
                second=next;
        }
    }
}
