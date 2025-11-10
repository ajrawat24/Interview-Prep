package MostImportantProgram;

public class RemoveDuplicateFromString1 {
    public static void main(String[] args) {
        String inputString = "Hello";

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < inputString.length(); i++)
        {
            char ch= inputString.charAt(i);
            int indexPosition= inputString.indexOf(ch, i+1);

            if(indexPosition==-1)
            {
                System.out.println(sb.append(ch));
            }

        }
    }

}
