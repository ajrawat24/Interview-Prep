package Top56Program;
class CheckPalindrom {
    public static void main(String[] args) {
        System.out.println("Check the string for palindrom");
        String s= "a";
        boolean isPalindrom= checkPalindrom(s);
        System.out.println("The given string-- "+ s +"--is==="+isPalindrom);
    }

    public static boolean checkPalindrom(String s)
    {
        int left=0;
        int right=s.length()-1;

        while(left< right)
        {
            if(s.charAt(left)== s.charAt(right))
            {
                return true;
            }
            left++;
            right--;
        }
        return false;

    }


}