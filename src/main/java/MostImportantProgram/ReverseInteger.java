package MostImportantProgram;

public class ReverseInteger {
    public static void main(String[] args) {
        int a = 214748364;
        System.out.println(reverseInteger(a));
    }

    public static int reverseInteger(int a) {

        boolean neg = a < 0;
        String s = Integer.toString(a);
        String rev = "";
        if (neg) s = s.substring(1);
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        //System.out.println(rev);

        long val = Long.parseLong(rev);

        if (neg) val = -val;

        if (val < Integer.MIN_VALUE || val > Integer.MAX_VALUE) return 0;
        return (int) val;

    }
}
