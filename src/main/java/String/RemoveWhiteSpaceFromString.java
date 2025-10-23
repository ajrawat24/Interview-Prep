package String;

/**
 * Input String j va a sta r
 * output String javastar
 *  <p><b>Example:</b></p>
 *  * <pre>
 *  * Input  : "j a v a sta r "
 *  * Output : javastar
 *  * </pre>
 *  replaceAll unicode of the space- \\s(space) replace with empty
 */

public class RemoveWhiteSpaceFromString {

    public static void main (String[] str)
    {
        String inputString="j a v a sta r ";
        String outputString=inputString.replaceAll("\\s","");

        System.out.println("String with spaces"+ " "+ inputString);
        System.out.println("String without space is"+ " "+ outputString);
    }
}
