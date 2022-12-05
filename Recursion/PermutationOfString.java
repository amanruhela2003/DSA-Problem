package College.Recursion.Recursion;

import java.util.ArrayList;

public class PermutationOfString {

    static ArrayList<String> getSubsequent(String Str,int i) {
        
        if (i==Str.length()) {

            ArrayList<String> arr = new ArrayList<String>();
            arr.add(" ");
            return arr;
        }

        char curr_char = Str.charAt(i);
        
        String rem_Str = Str.substring(0,i)+Str.substring(i);
        ArrayList<String> temp = getSubsequent(rem_Str,i+1);
        ArrayList<String> result = new ArrayList<String>();
        for (String s : temp) {
            result.add(s);
            result.add(curr_char + s);
        }
        return result;

    }

    public static void main(String[] args) {
        String str = "Ra";
        System.out.println(getSubsequent(str,0));

    }

}
