package org.example;
import java.util.HashMap;
public class FrequencyOfCharacter {
    public static void main (String[] args)
    {
       String inputString="Hello World";
       char[] chArray= inputString.toCharArray();

       HashMap<Character, Integer> hm= new HashMap<>();

       for( char ch : chArray)
       {
           // it return null if value is not preset

           if(ch==' ')
           {
               continue;
           }
         if(hm.containsKey(ch))
         {
             int count= hm.get(ch);
             count ++;
             hm.put(ch,count);



         }
         else {

             hm.put(ch,1);
       }


    }
       System.out.println(hm);
}}
