package StringInterview;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Tommorow {
    public static void main(String[] args) {
        String inputString="tommorow";
        StringBuilder sb=new StringBuilder();
        // replace second o with $

        char target='o';
        char[] ch= inputString.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++)
        {
            if (ch[i]==target)
            {
                count=count+1;

                if(count==2)
                {
                    ch[i]='$';

                    break;
                }


            }


        }
        System.out.println(new String(ch));


    }


}




