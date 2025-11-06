package String;

public class ReverseEachWord1 {
    public static void main(String[] args) {

        String inputString="My name is ajay";


        reverseEachWord(inputString);
        System.out.println(reverseEachWord(inputString));
    }

    public static String reverseEachWord(String inputString){

        String completeReverse="";
        String[] inputString1=inputString.split(" ");
        for(int i=0;i<inputString1.length;i++)
        {
            String eachWord= inputString1[i];
            String rev="";
            for(int j=eachWord.length()-1;j>=0;j--){

                rev= rev+eachWord.charAt(j);
            }

           completeReverse= completeReverse+ rev+ " ";

        }

        return completeReverse;
    }
}
