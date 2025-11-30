package Top56Program;
class ReverseStringWithoutChangeSecondLastCharacter {
    public static void main(String[] args) {

        String s = "independence";
        char[] ch = s.toCharArray();   // convert to char array

        int left = 0;
        int right = ch.length-1;

        // swap characters
        while (left < right) {

            if(ch[right]==s.charAt(s.length()-2))
            {
                right--;
                continue;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        // convert char array back to string
        String reversed = new String(ch);
        System.out.println(reversed);
    }
}
