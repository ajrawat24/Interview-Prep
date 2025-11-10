package String;

public class StringTwice {
    public static void main(String[] args) {

        String inputString= "Hello";

        String resultString= "";
        for(int i=0;i<inputString.length();i++){

            char ch= inputString.charAt(i);
            resultString   = resultString + ch+ ch;
        }
        System.out.println(resultString);
    }
}
