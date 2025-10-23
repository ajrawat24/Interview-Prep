package String;

/**
 * Program to remove duplicate characters from a string.
 *
 * Input  : Programming
 * Output : Progamin
 *
 * Explanation:
 * Keeps only the first occurrence of each character.
 */
public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        String inputString = "Programming";
        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {

            char ch = inputString.charAt(i);

            /** indexOf(ch, i + 1) searches for the same character after the current index
            // If it returns -1, it means this character does NOT appear again
            // if character is found it returns it position that we are ignoring
             */
            int indexPosition = inputString.indexOf(ch, i + 1);

            // Append the character only if it is NOT going to appear again later
            if (indexPosition ==-1 ) {
                outputString.append(ch);
            }

           /* if (indexPosition >-1 ) {
                outputString.append(ch); this will return all duplicates
            }*/
        }

        System.out.println("Input  : " + inputString);
        System.out.println("Output : " + outputString);
    }
}

/**| Step | Character | indexOf(ch, i+1) | Meaning         | Action |
        | ---- | --------- | ---------------- | --------------- | ------ |
        | 0    | P         | -1               | Not found again | ✅ Add  |
        | 1    | r         | 4                | Found again     | ❌ Skip |
        | 2    | o         | -1               | Not found again | ✅ Add  |
        | 3    | g         | 10               | Found again     | ❌ Skip |
        | 4    | r         | -1               | Not found again | ✅ Add  |
        | 5    | a         | -1               | Not found again | ✅ Add  |
        | 6    | m         | 7                | Found again     | ❌ Skip |
        | 7    | m         | -1               | Not found again | ✅ Add  |
        | 8    | i         | -1               | Not found again | ✅ Add  |
        | 9    | n         | -1               | Not found again | ✅ Add  |
        | 10   | g         | -1               | Not found again | ✅ Add  |

 */
