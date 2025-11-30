package Top56Program;
class ReverseStringPreservingSpace {
    public static void main(String[] args) {
        String s="I am Ajay";

        String reverseString= reverseString(s);
        System.out.println(reverseString);


    }

    public static String reverseString(String s)
    {
        int left=0;
        int right =s.length()-1;
        char[] ch=s.toCharArray();

        while(left< right)
        {
            if(ch[left]==' ')
            {
                left++;
                continue;

            }


            if(ch[right]==' ')
            {
                right++;
                continue;

            }

            char temp;
            temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }

        return new String (ch);


    }


}