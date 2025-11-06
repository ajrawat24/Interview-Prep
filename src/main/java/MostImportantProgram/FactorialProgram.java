package MostImportantProgram;

public class FactorialProgram {

    public static void main(String[] args) {
        int a=5;
     factorial(a);
    }

    public static int factorial(int n){

        if(n<=1) return 1;
        int fact=1;
        for(int i=n; i>=1; i--){

             fact= fact * i;
            System.out.print(fact+" ");

        }
        System.out.print(fact+" ");
        return fact;
    }
}
