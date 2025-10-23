package String;

public class ReverseStringWithStringBuilder {
    public static void main(String[] args) {
        String s="MadamD";
        String lowerCaseString=s.toLowerCase();
        StringBuilder sb=new StringBuilder(lowerCaseString);
       String  reversed =sb.reverse().toString();
        //String reversed = new StringBuilder(lowerCaseString).reverse().toString();
        System.out.println(reversed);
        if(reversed.equals(lowerCaseString)){
            System.out.println("String is palindrom");
        }
        else {
            System.out.println("String is not palindrom");
        }

    }

}
