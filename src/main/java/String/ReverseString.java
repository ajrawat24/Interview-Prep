package String;

public class ReverseString {
    public static void main(String[] args) {
        String s="Madam";
        String lowerCaseString=s.toLowerCase();
        String reverse="";
        for(int i=lowerCaseString.length()-1;i>=0;i--){
            reverse=reverse+lowerCaseString.charAt(i);
        }
        System.out.println(reverse);

        if(reverse.equals(lowerCaseString)){
            System.out.println("Yes String is palindrome");
        }
            else{
                System.out.println("No String is palindrome");
            }
        }
    }


