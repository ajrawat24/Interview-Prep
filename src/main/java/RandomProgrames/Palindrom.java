package RandomProgrames;

public class Palindrom {

    public static void main(String[] str) {
         String inputString = "madad";

        Boolean palindrom = checkPalindrom(inputString);
        System.out.println("The given string is palindrom ===="+palindrom);
    }



    public static boolean checkPalindrom(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;
        Boolean isPalindrome = false;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(left) == inputString.charAt(right)) {
                left++;
                right--;
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }


        }
        return isPalindrome;
    }
}
