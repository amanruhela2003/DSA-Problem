import java.util.ArrayList;

//Leetcode Problem 17-Letter combination of phone number
public class LetterCombination {
    static String keyPadKeys[] = {
        ".", "@#$", "abc", "def",
        "ghi", "jkl", "mno", "pqrs",
        "tuv", "wxyz"
        };

    static ArrayList<String> combination(String num)
    {
        //Base Cases
        if(num.length()==0)
        {
            ArrayList<String> temp=new ArrayList<>();
            temp.add("");
            return temp;

        }
        //Program Logic

        char fnum=num.charAt(0);
        String remString=num.substring(1);
        int index=fnum-'0';
        String word=keyPadKeys[index];
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<word.length();i++)
        {
            ArrayList<String> temp=combination(remString);
            for(String str:temp)
            {
                result.add(word.charAt(i)+str);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        //combination("23");
        System.out.println(combination(""));
        
    }
}
