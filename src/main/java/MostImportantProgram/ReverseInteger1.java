package MostImportantProgram;

public class ReverseInteger1 {

    public static void main(String[] args) {

        int num=12345;
        int rev=reverseInteger(num);
        System.out.println(num);
        System.out.println(rev);

    }

    public static int reverseInteger(int num) {

        int rev=0;
        int lastDigit;
        while (num!=0) {

            lastDigit= num%10;
            rev= rev*10 + lastDigit;
            num= num/10;

        }
        return rev;
    }
}
