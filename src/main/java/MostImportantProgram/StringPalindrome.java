package MostImportantProgram;

public class StringPalindrome {

    public static void main(String args[]){

        String inputString= "madam";
        String rev="";
        for(int i=inputString.length()-1;i>=0;i--){

            rev=rev+inputString.charAt(i);

        }
        if(rev.equals(inputString)){

            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not Palindrome");
        }
    }
}
