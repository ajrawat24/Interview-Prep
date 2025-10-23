package String;

public class RemoveDuplicateFromString1 {

    public static void  main(String[] str){
      String  inputString="programming";

      StringBuilder outputString=new StringBuilder();


      for(int i=0;i<inputString.length(); i++)
      {
          char ch=inputString.charAt(i);

          int indexPosition= inputString.indexOf(ch, i+1);

          if(indexPosition==-1)
          {
              outputString.append(ch);

          }

         /* if(indexPosition >1)
          {
              outputString.append(ch);
          }
*/
      }
        System.out.println(outputString);



    }
}
