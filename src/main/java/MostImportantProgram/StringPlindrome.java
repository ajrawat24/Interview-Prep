package MostImportantProgram;

public class StringPlindrome {
    public static void main(String[] args) {

        String inputString="racecao";
                String lowercase=inputString.toLowerCase();

                CheckPalindrome(lowercase);

    }
    public static void CheckPalindrome(String lowercase){

        String rev="";

        for(int i=lowercase.length()-1;i>=0;i--){

            rev=rev+lowercase.charAt(i);
        }

        if(rev.equals(lowercase)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
