package Top56Program;

public class SwapTwoNumber {
public static void main(String[] args) {
            System.out.println("Swap two numbers using third variable and without using third variable");
            int a=5;
            int b=10;
            int[] result = swapNumber(a, b);
            System.out.println("new value of a="+result[0]+"new value of B="+result[1]);

        }

        public static int[] swapNumber(int a, int b)
        {
            a=a+b;
            b= a-b;
            a=a-b;
            int[] result= {a,b};
            return result;
        }

    }

