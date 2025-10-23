package String;

public class ReverseString2 {

    public static void main(String[] arg){

        String inputString= "Hello World";
        String reverseString="";
        for(int i =inputString.length()-1;i>=0;i--){

            reverseString =reverseString+  inputString.charAt(i);

        }
        System.out.println(reverseString);
    }
}
