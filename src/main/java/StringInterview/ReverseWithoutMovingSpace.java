package StringInterview;

//public class ReverseWithoutMovingSpace {
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseWithoutMovingSpace {
    public static void main(String[] args) {
        String words= "Hello world";
        String[] wordArray= words.split(" ");
        StringBuilder sb= new StringBuilder();

        for(String w: wordArray)
        {
            char[] ch= w.toCharArray();
            int left=0;
            int right=ch.length-1;
            while(left<right)
            {
                char temp;
                temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            sb.append(new String(ch)).append(" ");

            //System.out.print(new String(ch) + " ");

        }
        System.out.println(sb.toString());

    }
}