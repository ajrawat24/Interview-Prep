package String;

public class PrintDuplicateChracter {
    public static void main(String[] str)
    {
        String inputString = "hello world";
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<inputString.length(); i++)
        {
            char ch= inputString.charAt(i);
            Integer indexPostion= inputString.indexOf(ch,i+1);

            if(indexPostion >-1)
            {
                //System.out.println(ch);
                sb.append(ch);
                System.out.println(ch);
            }
        }


    }
}
