package MostImportantProgram;

public class SwapNumberWithVariable {

    public static void main(String[] args) {
        int a=5;
        int b=10;
        swapNumber(a,b);
       // System.out.println(a+" "+b);
    }

    public static void  swapNumber(int a,int b)
    {
        int temp=a;
        a=b;
        b= temp;

         System.out.println(a+" "+b);
    }
}
