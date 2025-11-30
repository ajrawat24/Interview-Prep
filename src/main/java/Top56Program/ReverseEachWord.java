package Top56Program;
class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println("Reverse Only letter");
        String s= "hello world";

        String reverseWords=reverseEachWord(s);
        System.out.println(reverseWords);
    }

    public static String reverseEachWord(String s)
    {
        String[] words= s.split(" ");
        String completeReverseWord="";
        for ( String word: words)
        {
            String rev="";
            for (int i=word.length()-1; i>=0 ; i--)
            {
                rev= rev+word.charAt(i);
            }

            completeReverseWord=completeReverseWord+rev+ " ";
        }
        return completeReverseWord;

    }


}