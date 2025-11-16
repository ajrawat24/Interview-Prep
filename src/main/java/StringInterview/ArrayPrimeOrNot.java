package StringInterview;

public class ArrayPrimeOrNot {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6,7,8,9,10};


            for(int num: arr)
            {

                if(num<=1)
                {
                    System.out.println(num + "number is not prime");
                    continue;
                }
                Boolean isPrime=true;
                for(int j=2; j<=num/2; j++)
                {
                    if(num%j==0)
                    {
                        isPrime=false;
                        break;
                    }
                }
                // Print result
                if (isPrime) {
                    System.out.println(num + " is PRIME");
                } else {
                    System.out.println(num + " is NOT prime");
                }
            }
        }
    }







