package intervew;

public class ReverseEachWordString {
    public static void main(String[] args) {

        String inputString= "Ajay rawat is from India";

        String[] words= inputString.trim().split(" ");
        String reverseComplete="";
        for(int i=0;i<words.length;i++)
        {

                String word= words[i];
                String rev="";
            for(int j=word.length()-1; j>=0;j--)
            {
                rev=rev+word.charAt(j);
            }
                reverseComplete=reverseComplete+rev+" ";
        }

            System.out.println(reverseComplete);
    }
}
