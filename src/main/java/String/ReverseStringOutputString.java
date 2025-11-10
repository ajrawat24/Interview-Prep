package String;

public class ReverseStringOutputString {

    public static void main(String[] str){

    String inputString="welcome";
        String rev="";
    for(int i=inputString.length()-1; i>=0; i--)
    {
         rev=rev+inputString.charAt(i);

    }
    System.out.println(rev);
}}
