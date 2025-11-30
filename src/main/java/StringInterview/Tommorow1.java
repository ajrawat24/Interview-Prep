package StringInterview;

public class Tommorow1 {
    public static void main(String[] str)
    {
        String inputString= "tommorow";
        int firstIndex= inputString.indexOf('o');

        System.out.println(firstIndex);
        int secondIndex= inputString.indexOf('o', firstIndex+2);
        //int secondIndex = inputString.indexOf('o', firstIndex + 1);
        System.out.println(secondIndex);
        String replacedString= inputString.substring(0, secondIndex)+ "$"+ inputString.substring(secondIndex+2);

        System.out.println(replacedString);

    }
}
