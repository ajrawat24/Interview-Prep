package String;

/*  1. Break the sentence into words
    2. Compare lengths
    3.Store the biggest word
    4. Print it
*/
public class PrintWordMoreCharacters {
    public static void main(String[] str){
    String inputString = "We will have session on 8:30 PM on staturday";
        String[] words = inputString.split(" ");
        System.out.println(words.length);
      String  longestWord = "";

        for (int i = 0; i<words.length; i++)
        {
            String word=words[i];
           if(word.length()> longestWord.length())
               {
               longestWord=word;
               }
        }
        System.out.print(longestWord);
    }
}
