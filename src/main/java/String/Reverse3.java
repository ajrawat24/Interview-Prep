package String;

public class Reverse3 {

    public static void main(String[] str){

        String inputString = "Hello World";
        char[] ch= inputString.toCharArray();
        int left=0;
        int right=ch.length-1;


        while (left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right++;
        }
        String reversed = new String(ch);
        System.out.println("Reversed String: " + reversed);
    }


}
