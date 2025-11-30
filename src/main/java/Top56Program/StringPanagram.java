package Top56Program;

    public class StringPanagram {
        public static void main(String[] args) {
            System.out.println(" Write a program to check if given string is panagram or not");

            String s1= "The quick brown fox jumps over the lay dog";

            String s= s1.replaceAll(" ","").toLowerCase();
            System.out.println(s);
            //char[] ch= s.toCharArray();
            int[] freq= new int[26];

            for(int i=0; i< s.length(); i++)
            {
                char ch= s.charAt(i);
                if(ch>='a' && ch <='z')
                {
                    freq[ch-'a']++;

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

                char letter= (char)('a'+ i);
                System.out.println(letter+"==" +freq[i]);


            }


            if(isPanagram)
            {
                System.out.println(isPanagram);

            }
            else
            {
                System.out.println(isPanagram);
            }


        }
    }

