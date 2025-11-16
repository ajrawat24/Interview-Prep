

public class ReverseString2
{

    public static void main(String[] str)
    {
        String inputString= "mya$a%@y";
        // output will be = yaa$y%@m

        char[] inputArr= inputString.toCharArray();
        int left=0;
        int right=inputString.length()-1;

        while(left<right)
        {
            if(!Character.isAlphabetic(inputArr[left]))
            {
                left++;
            }

            if(!Character.isAlphabetic(inputArr[right]))
            {
                right--;
            }
            else
            {
                char temp;
                temp=inputArr[left];
                inputArr[left]=inputArr[right];
                inputArr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println("The reversed array is   "+ new String(inputArr));


    }
}
