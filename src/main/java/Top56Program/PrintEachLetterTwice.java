package Top56Program;



public class PrintEachLetterTwice {
    public static void main(String[] args)
    {

        String s= "hello";
        StringBuilder sb= new StringBuilder();

        System.out.println("Print each letter twice of the string");

        for(int i=0; i< s.length(); i++)
        {
            sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
