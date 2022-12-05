package College.Recursion.Recursion;

public class WordFrequency {

    static int checkfreq(String str,char a,int s,int e,int freq)
    {
        if(s==e)
        {
            return freq;
        }
        if(str.charAt(s)==a)
        {
            freq++;
        }
        checkfreq(str, a, s+1, e, freq);


        return freq;
    }
    static void wordCaller(String str,int s)
    {   
        if(s==str.length())
        {
            return;
        }
        System.out.println("Frequency of Word "+ str.charAt(s)+": "+checkfreq(str,str.charAt(s), 0,str.length()-1,0));
        wordCaller(str,s+1);
    }

    public static void main(String[] args) {
        wordCaller("Aaa", 0);

    }

}
