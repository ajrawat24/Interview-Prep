package Array;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int[] Oldarr={1,12,13,2,34};
        System.out.println(Oldarr.length);
        int element=35;
      int[] newArray=new int[Oldarr.length+1];
      System.out.println(newArray.length);

  for(int i=0;i<Oldarr.length;i++)
  {
      newArray[i]=Oldarr[i];
  }
  newArray[newArray.length-1]=element;

  for(int i=0;i<newArray.length;i++)
  {
      System.out.println(newArray[i]);
  }

    }
}
