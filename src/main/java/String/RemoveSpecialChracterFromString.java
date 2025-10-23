package String;

/**
 * Utility class to demonstrate removing special characters from a string.
 *
 * <p>This program removes all special characters from a given input string
 * using the {@link String#replaceAll(String, String)} method and a regular expression.</p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 * Input  : $#%Hel*&$llo
 * Output : Hello
 * </pre>
 *
 * @author Ajay Rawat
 * @version 1.0
 * @since 2025-10-17
 */
public class RemoveSpecialChracterFromString {

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments (not used here)
     */
    public static void main(String[] args) {

        // Input string containing special characters
        String inputString = "$#%Hel*&$llo";

        // Remove all non-alphanumeric characters using regex
        // [^a-zA-Z0-9] → matches any character that is NOT a letter or number
        String cleanedString = inputString.replaceAll("[^a-zA-Z0-9]", "");

        // Print the cleaned string
        System.out.println("Original String: " + inputString);
        System.out.println("Cleaned String : " + cleanedString);
    }
}
