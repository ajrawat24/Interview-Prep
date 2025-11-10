package String;

public class CountNumberOfWord {
    public static void main(String[] args) {

        String inputString="welcome , to my club ?";
        String[] words=inputString.trim().split(" ");
        System.out.println(words.length);
        for(int i=0;i<words.length;i++)
        {

            System.out.println(words[i]);
        }


    }
}
