package String;

public class SwapStrings {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


        public static void main(String[] args) {

            String str1= "hello";
            String str2="worldd";

            str1= str1+str2; // helloworld
            System.out.println(str1);
            str2= str1.substring(0,str1.length()- str2.length()); // (10-5)=5 ==// hello
            System.out.println(str2+"   "+ "value of str2");
            str1= str1.substring(str2.length()); //(5)

            System.out.println(str1+"value of str1");

        }
    }

