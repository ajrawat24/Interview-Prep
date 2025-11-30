package Top56Program;
import java.util.*;

public class PrintLengthLastWordUsingStringArray {
    public static void main(String[] args) {
        System.out.println("Print the length of last word in the string");

        String s="hello world";
        String[] words=s.split(" ");

        int len= words[words.length-1].length();

        System.out.println(len);
    }
}