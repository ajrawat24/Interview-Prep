package StringInterview;

public class ReverseStringNotSpecialChracter {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            String inputString= "mya$a%@y";
            char[] input=inputString.toCharArray();
            int left=0;
            int right=inputString.length()-1;

            while(left<right)
            {
                if(!Character.isAlphabetic(input[left]))
                {
                    left++;
                }
                if(!Character.isAlphabetic(input[right]))
                {
                    right--;
                }
                else
                {
                    char temp;
                    temp=input[left];
                    input[left]=input[right];
                    input[right]=temp;
                    left++;
                    right--;

                }
            }
            System.out.println(new String(input));

        }
    }