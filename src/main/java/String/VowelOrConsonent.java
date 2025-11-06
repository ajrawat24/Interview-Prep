package String;

public class VowelOrConsonent {

    public static void main(String[] args) {
/*Step:

1. We have a character
2. We know which charactes are vowels
3. We take each cracter and traverse it in the array of vowels
4. if character is found in the array that means it is vowels else it is consonent
* **/

        char ch='u';
       // A, E, I, O, U → vowels
       // B, C, D, F, G, ... → consonants
        char[] arr={'a','e','i','o','u'};

        boolean isVowel = false;

        for(char c:arr){

            if(c==ch){

                isVowel=true;
                System.out.println(ch+ "is a vowel");
            }
            else isVowel=false;

        }
        if(isVowel)
        {
            System.out.println(ch+ "is a vowel");

        }
        else
        {
            System.out.println(ch+ "is a consonent");
        }

    }
}
