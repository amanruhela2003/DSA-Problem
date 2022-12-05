package College.Recursion.Recursion;

import java.util.ArrayList;

public class FindSubsequent {
    

    static ArrayList<String> getSubsequent(String Str)
    {
        if(Str.length()==0)
        {

            ArrayList<String> arr=new ArrayList<String>();
            arr.add(" ");
            return arr;
        }

        char curr_char=Str.charAt(0);
        String rem_Str=Str.substring(1);
        ArrayList<String> temp=getSubsequent(rem_Str);
        ArrayList<String> result=new ArrayList<String>();
        for(String s:temp)
        {
            result.add(s);
            result.add(curr_char+s);
        }
        return result;


    }

    public static void main(String[] args) {
        String str="Ravi";
        System.out.println(getSubsequent(str));
        
    }
    
}
