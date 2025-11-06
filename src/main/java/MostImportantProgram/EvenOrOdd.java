package MostImportantProgram;

public class EvenOrOdd {

    public static void main(String[] args) {
        int a= 10;
        CheckOdd(a);
    }

    public static void CheckOdd(int a){

        if(a%2==0){

            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
