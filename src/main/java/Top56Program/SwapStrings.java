package Top56Program;



    public class SwapStrings {
        public static void main(String[] args)
        {
            String str1="hello";

            String str2= "world";

            str1=str1+str2; // helloworld

            str2= str1.substring(0, str1.length()- str2.length());

            System.out.println("The swapped value of str2="+ str2);

            str1= str1.substring(str2.length()); // substring(5);
            System.out.println("The swapped value of str1="+ str1);

        }

    }


