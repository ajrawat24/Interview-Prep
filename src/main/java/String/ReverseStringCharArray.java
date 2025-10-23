package String;

public class ReverseStringCharArray {
    public static void main(String[] str){

        String s="Hello";
        char[] charArray=s.toCharArray();
        int length=charArray.length-1;
        for(int i=length;i >=0; i--)
        {
            System.out.print(charArray[i]);
        }


    }
}
