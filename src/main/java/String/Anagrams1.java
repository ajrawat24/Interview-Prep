package String;

import java.util.Scanner;



    import java.util.Scanner;

    public class Anagrams1 {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            String str1= a.toLowerCase();
            String str2= b.toLowerCase();
            int[] arr= new int[26];

            if(str1.length()>str2.length()){
                return false;
            }
            for(int i=0; i<str1.length(); i++)
            {
                char ch= str1.charAt(i);
                arr[ch-'a']++;

            }

            for(int i=0; i<str2.length(); i++)
            {
                char ch= str2.charAt(i);
                arr[ch-'a']--;

            }

            for( int i=0; i< arr.length; i++)
            {

                if(arr[i]!=0)
                {
                  return false;
                }

            }
            return true;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }

