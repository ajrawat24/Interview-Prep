package MostImportantProgram;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        String inputString = "Hello";
        removeDuplicate(inputString);

    }

    public static void removeDuplicate(String inputString) {
    StringBuilder sb= new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {

            char ch = inputString.charAt(i);
            int indexPositon = inputString.indexOf(ch, i+1 );

            if (indexPositon > -1) {
                System.out.println(ch);
            }

            if (indexPositon == -1) {
              //System.out.println(sb.append(ch));

            }

        }
    }
}
