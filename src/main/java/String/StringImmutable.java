package String;

public class StringImmutable {

    public static void main(String[] args) {
        // Create a String object
        String originalString = "Hello";
        System.out.println("Original String: " + originalString);

        // Attempt to modify the String
        String modifiedString = originalString.concat(" World");
        System.out.println("Modified String: " + modifiedString);

        // Original string remains unchanged
        System.out.println("Original String after modification attempt: " + originalString);

        // Example URL
        String url = "http://firstgames.in";

        // Option 1: call static method directly
        String subdomain = getSubdomain(url);

        // print result
        System.out.println("Subdomain: " + subdomain);
    }

    // Make this method static so it can be called from main
    public static String getSubdomain(String url) {
        int start = url.indexOf("://") + 3;  // skip 'http://'
        int end = url.indexOf('.', start);   // find the first dot after domain
        return url.substring(start, end);    // extract subdomain
    }
}
