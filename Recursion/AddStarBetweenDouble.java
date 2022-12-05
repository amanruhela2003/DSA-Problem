package College.Recursion.Recursion;

public class AddStarBetweenDouble {
    static String output="";

    static void star(String str,int i)
{
    output=output+str.charAt(i);
    if(i==str.length()-1)
    {
        return;
    }

        if(str.charAt(i)==str.charAt(i+1))
        {
            output=output+"*";
        }
        star(str,i+1);
    }




    public static void main(String[] args) {
        String str="aabbbcc";
        star(str, 0);
        System.out.println(output);
    
}
}
