package String;

public class ReverseStringNotMoveSpaces {

    public static void main(String[] str)
    {
        String originalString= "I Am XYZ";
       char[] original = originalString.toCharArray();
       char[] letter= originalString.replace(" ","").toCharArray();
       int left=0;
       int right=letter.length-1;
       while(left<right)
       {
           char temp=letter[left];
           letter[left]=letter[right];
           letter[right]=temp;
           left++;
           right--;
       }
       int index=0;
       for(int i=0;i<originalString.length();i++)
       {
           if(original[i]!=' ')
           {
               original[i]=letter[index];
               index=index+1;
           }
       }
        System.out.print(new String(original));
    }
}

