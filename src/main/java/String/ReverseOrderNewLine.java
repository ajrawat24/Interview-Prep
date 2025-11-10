package String;

public class ReverseOrderNewLine {
    public static void main(String[] args)
    {
        String inputString= "Welcome";

        for(int i=inputString.length()-1;i>=0;i--)
        {
            char ch=inputString.charAt(i);
            System.out.println(ch);
        }
    }
}
