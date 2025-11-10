package Array;

public class Interview {

    public static void main(String[] str) {

        String inputString = "Ajay Rawat from India";
        String reverseComplete = "";

        String[] words = inputString.split(" ");

        for (String word : words) {
            String rev = "";  // reset for each word

            // Reverse current word
            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }

            // Add reversed word + space
            reverseComplete = reverseComplete + rev + " ";
        }

        System.out.println(reverseComplete);
    }
}
