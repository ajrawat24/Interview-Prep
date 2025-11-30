package String;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Panagram {
    public static void main(String[] args) {
        System.out.println("check if given string is panagram or not");
        String str1="The quick brown fox jumps over the lazy dog";
        String str= str1.toLowerCase();
        int[] freq= new int[26];

        for( int i=0; i< str.length(); i++)
        {
            char ch= str.charAt(i);

            if(ch >='a' && ch<='z')
            {
                freq[ch- 'a']++;
            }

        }
        boolean isPanagram=true;
        for(int i=0; i<freq.length; i++)
        {
            if(freq[i]==0)
            {
                isPanagram=false;
                break;
            }
        }

        if(isPanagram)
        {
            System.out.println("String is panagram");
        }
        else
        {
            System.out.println("String is not panagram");
        }

    }
}