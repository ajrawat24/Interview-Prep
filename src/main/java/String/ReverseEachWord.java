package String;/*
package String;

public class ReverseEachWord {
    public static void main(String[] args) {
        String inputString = "Java is programming";
        String[] word=inputString.split(" ");
        String reverseString="";

        for(int i=0;i<word.length;i++){
            String oneWord=word[i];
            String revWord="";
            char ch;

            for(int j=oneWord.length()-1; j<=0; j--){

                ch=oneWord.charAt(j);

                revWord= ch + revWord;

            reverseString=reverseString+revWord;
            System.out.print(reverseString);
        }



    }
}}
*/



public class ReverseEachWord {

    public static void main(String[] args) {
        reverseEachWordOfString("Java is good programming languages");
    }

    static void reverseEachWordOfString(String inputString) {
        // Split the sentence into words based on space
        String[] words = inputString.split(" ");
        String reverseString = ""; // To hold final reversed sentence

        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i]; // Current word
            String nstr = "";       // To store reversed word
            char ch;

            // Reverse the current word character by character
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);     // Get each character
                nstr = ch + nstr;        // Add character in front of existing string
            }

            // Add reversed word to final sentence with a space
            reverseString = reverseString + nstr + " ";
        }

        System.out.println(inputString);
        System.out.println(reverseString);
    }
}
