package MostImportantProgram;

public class SwapTwoString {

    public static void main(String[] args) {

        String str1="Ajay";
        System.out.println(str1.length());

        String str2="Amit";
        System.out.println(str2.length());
        str1=str1+str2;

        System.out.println(str1.length());
        str2=str1.substring(0,str1.length()-str2.length()); //(0, 8-4=4)

        System.out.println(str2.length());

        str1=str1.substring(str2.length()); // here we are saying (bing with str2.length from 4th position

        System.out.println(str1);
        System.out.println(str2);

    }
}
