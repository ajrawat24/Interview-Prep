package MostImportantProgram;

public class SwapNumberWithoutVariable {

    public static void main(String[] arg){
        int a=5;
        int b=10;

        swapTwoNumber(a, b);
    }

    public static void swapTwoNumber(int a, int b){
        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }
}
