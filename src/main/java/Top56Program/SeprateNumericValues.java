package Top56Program;

public class SeprateNumericValues {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
public static void main(String[] args) {
            String s="hello123world";
            char[] ch= s.toCharArray();
            StringBuilder digits= new StringBuilder();
            StringBuilder alphabet= new StringBuilder();
            for(int i=0; i<s.length(); i++)
            {
                if(Character.isDigit(s.charAt(i)))
                {
                    digits.append(s.charAt(i));
                }
                if(Character.isLetter(s.charAt(i)))
                {
                    alphabet.append(s.charAt(i));
                }
            }
            System.out.println("Digits are="+digits);
            System.out.println("alphabets are="+alphabet);
            int index = s.indexOf("123");
            System.out.println(index);
            String alphabets= s.substring(0, index )+ " "+ s.substring(index+ digits.length());
            System.out.println(alphabets);

        }

    }

