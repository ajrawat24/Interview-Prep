package Top56Program;

class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println("Reverse Only letter");
        String s= "h5e3ll&o"; // output should be= o5l3e&h

        String reversedLetters= reverseOnlyLetters(s);
        System.out.println(reversedLetters);
    }
    public static String reverseOnlyLetters(String s)
    {
        char[] ch= s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while (left< right)
        {
            if(!Character.isLetter(ch[left]))
            {
                left++;
                continue;

            }
            if(!Character.isLetter(ch[right]))
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


}

