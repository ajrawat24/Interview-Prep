package Top56Program;

public class ReplaceLeadingZeros {
            public static void main(String[] args) {
            String s="00000012345";
            char[] ch= s.toCharArray();
            String withoutZero="";
            for(int i=0; i<s.length()-1; i++)
            {
                if(s.charAt(i)=='0')
                {
                    continue;
                }
                withoutZero= withoutZero + s.charAt(i);

            }
            System.out.println(withoutZero);
        }

    }

