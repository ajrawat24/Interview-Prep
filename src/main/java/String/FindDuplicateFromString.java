package String;

public class FindDuplicateFromString {

    public static void main(String[] str)
        {
            String inputString="Hello";
            StringBuilder sb= new StringBuilder();

            for(int i=0; i<= inputString.length()-1; i++)
            {
                char ch= inputString.charAt(i);
                int indextPosition=inputString.indexOf(ch, i+1);
                if (indextPosition==-1)
                {
                    sb.append(ch);
                }

            }
            System.out.println("The duplicates are"+ sb.toString());

        }
    }


