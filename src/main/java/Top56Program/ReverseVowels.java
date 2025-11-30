package Top56Program;
class ReverseVowels {
    public static void main(String[] args) {
        System.out.println("Check the string for reversal of vowels");
        String s= "helloworld";

        String reversedVowels= reverseVowels(s);
        System.out.println(reversedVowels);
    }
    public static String reverseVowels(String s)
    {
        char[] ch= s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while (left< right)
        {
            if(!isVowel(ch[left]))
            {
                left++;
                continue;

            }
            if(!isVowel(ch[right]))
            {
                right --;
                continue;
            }

            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;


        }
        return new String(ch);

    }

    public static boolean isVowel(char ch)

    {
        return ch=='a'|| ch=='e'||ch== 'i'|| ch=='o'||ch== 'u';

    }
}