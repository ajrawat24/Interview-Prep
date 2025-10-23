package String;

public class ReverseWithStringBuffer {
    public static void main(String[] args) {
        String s = "Hello";

        StringBuffer sb = new StringBuffer(s);
        sb.reverse().toString();
        System.out.println(sb);
    }
}
