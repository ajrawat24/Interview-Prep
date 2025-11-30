package String;

class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String s = "hello world";
        int[] freq = new int[256];

        // Step 1: Fill frequency array
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        // Step 2: Print frequency of each character
        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " = " + freq[i]);

            }
        }

        // Step 3: Find first non-repeating character
        System.out.print("\nFirst non-repeating character: ");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] == 1) {
                System.out.println(ch);
                return;   // Exit after first found
            }
        }

        // If none found
        System.out.println("No non-repeating character");
    }
}
