package Top56Program;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReplaceVowel {
    public static void main(String[] args) {
        System.out.println("Write a java program to replace all vowels in the input name with chracter x");

        String s= "hello world";
        char[] ch= s.toCharArray();
        for(int i=0; i<s.length(); i++)
        {
            if(isVowel(ch[i]))
            {
                ch[i]='x';
            }
        }

        System.out.println(new String(ch));

    }
    public static boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}