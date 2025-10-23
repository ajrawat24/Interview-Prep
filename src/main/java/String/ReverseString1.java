package String;

public class ReverseString1 {

    public static void main(String[] str) {
        String inputString = "Hello World";
        StringBuilder outputString = new StringBuilder(inputString);

        String reversedString = outputString.reverse().toString();
        System.out.println(reversedString);


    }
}
