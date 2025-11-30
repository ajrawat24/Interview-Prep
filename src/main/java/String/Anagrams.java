// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package String;
class Anagrams {
    public static void main(String[] args) {
        //listen → silent
        String str1= "listen";
        String str2= "silent";
        boolean result=isAnagram(str1,str2);
        System.out.println("String is anagram==="+ result);
    }

    public static boolean isAnagram(String str1, String str2)
    {
        int[] counts= new int[26]; // initialize the array bucket

        for(int i=0; i<str1.length(); i++) // fill the bucket
        {
            counts[str1.charAt(i)-'a']++;

        }
        for(int i=0; i<str2.length(); i++) // empty the bucket
        {
            counts[str2.charAt(i)-'a']--;

        }

        for(int count:counts)
        {
            if(count!=0)
            {
                return false;
            }

        }
        return true;

    }

}