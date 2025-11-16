package StringInterview;

public class WithoutMoveSpace {
// Online Java Compiler
// Use this editor to write, compile and run your Java code online


        public static void main(String[] args) {
            String str="I am XYZ";
            char[] inputString=str.toCharArray();
            char[] letters= str.replace(" ","").toCharArray();
            int left=0;
            int right= letters.length-1;
            while(left< right)
            {
                char temp;
                temp=letters[left];
                letters[left]=letters[right];
                letters[right]=temp;
                left++;
                right--;
            }

            int index=0;
            for(int i=0; i< inputString.length; i++)
            {
                if(inputString[i]!=' ')
                {
                    inputString[i]=letters[index];
                    index =index+1;
                }
            }
            System.out.println(inputString);

        }
    }
