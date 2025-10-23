package String;

public class RemoveSpacesWithoutInbuilt {
    public static void main(String[] str){

        String inputString ="A j a y R a w at";

        StringBuilder outputString= new StringBuilder();

        for (int i=0; i<inputString.length(); i++){
          char ch= inputString.charAt(i);

          if(ch!=' ')
            {
                outputString.append(ch);
            }

        }
        System.out.println(outputString.toString());

    }
}
