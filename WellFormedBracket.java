package College.Recursion.MultipleRecursion;

import java.util.ArrayList;

public class WellFormedBracket 
{

    public static ArrayList<String> generate(int n)
    {
        ArrayList<String> ans = new ArrayList<>();
        helper(ans, "", 0, 0, n);
        return ans;
    }
    static void helper(ArrayList<String> ans,String currentBracket,int open,int close,int max)
    { 
        if (currentBracket.length() ==max * 2) 
        { 
            ans.add(currentBracket); 
            return;
        }
        if(open<max)
        {
            helper(ans, currentBracket+"(", open+1, close, max);
        }
        if(close<open)
        {
            helper(ans, currentBracket+")", open, close+1, max);
        }
    }
public static void main(String[] args) {
     System.out.println(generate(3));
}
}