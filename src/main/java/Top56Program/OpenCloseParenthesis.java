package Top56Program;
class OpenCloseParenthesis {
    public static void main(String[] args) {
        // how many needed to make a valid paranthesis
        String s="(";
        int minOpenClose =requiredParanthesis(s);
        System.out.println(minOpenClose);
    }

    public static  int requiredParanthesis(String s)
    {
        int open=0;
        int close=0;
        int minrequired=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
            }
            else
            {
                if(open>0)
                {
                    open--;
                }
                else
                {
                    close++;
                }
            }
            minrequired= open+close;
        }
        return  minrequired;
    }
}

