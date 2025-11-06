package MostImportantProgram;

public class OptimizedPlindrome {

    public static void main(String[] srr) {

        String inputString = "Madam";

        checkPalimdrome(inputString);
    }
    public static String checkPalimdrome(String inputString) {

        int left=0;
        int right=inputString.length()-1;
        while(left< right){
            if(inputString.charAt(left)!=inputString.charAt(right)){

                return "Not palindrom";
            }
        }
        return "palindrom";

    }
}
