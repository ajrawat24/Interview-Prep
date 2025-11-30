package Top56Program;
import java.util.*;

public class PrintLengthLastWord {
    public static void main(String[] args) {
        System.out.println("Print the length of last word in the string");

        String s="hello world";
        int count=0;

        for(int i= s.length()-1; i>0; i--)
        {

            if(s.charAt(i)==' ')
            {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}