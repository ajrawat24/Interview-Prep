package MostImportantProgram;

public class LengthOfLastString {

    public static void main(String[] args) {

        String inputString= "Hello World";
        lengthOfLastWord(inputString);


    }
    public static void lengthOfLastWord(String inputString){

        String[] inputArray = inputString.split(" ");
        String lasword= inputArray[inputArray.length-1];

        System.out.println(lasword);

        System.out.println(lasword.length());


    }
}
