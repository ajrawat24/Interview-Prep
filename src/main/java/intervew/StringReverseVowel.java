package intervew;

public class StringReverseVowel {

    public static void main(String[] args) {

        String inputString = "helloworld";
        char[] arr = inputString.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        while(left<right){
        while (left < right && !isVowel(arr[left])) {
            left++;
            // if the vowel found it will stop and will move to swapping

        }
        while (left < right && isVowel(arr[right])) {
            right--;
            // if the vowel found it will stop and will move to swapping
        }

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;


    }
      System.out.println(new String(arr));
}

    public static boolean isVowel (char c)
    {
        c= Character.toLowerCase(c);
        return (c=='a'|| c=='e'||c=='i'||c=='0' || c=='u');

    }
}