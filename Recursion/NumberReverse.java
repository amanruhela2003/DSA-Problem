package College.Recursion.Recursion;

public class NumberReverse {

    static int rev=0;
    static int  reverse(int num)
    {
        if(num==0)
        {
            return rev;
        }
        rev=(rev*10)+(num%10);
        reverse(num/10);
        return rev;

    }

    public static void main(String[] args) {
        int rv=reverse(12345);
        System.out.println(rv);
        
    }
    
}
