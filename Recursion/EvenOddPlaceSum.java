package College.Recursion.Recursion;

public class EvenOddPlaceSum {
    static int rev=0;
    static int sumOdd=0;
    static int sumEven=0;
    static int count=1;

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
    static void sum(int num)
    {
        if(num==0)
        {
            return;
        }
        if ( count % 2 == 0)
        {
            sumEven+=num%10;
        }
        else
        {
            sumOdd+=num%10;
        }
        count++;
        sum(num/10);

    }
    public static void main(String[] args) {
        int rv=reverse(908987);
        System.out.println(rv);
        sum(rev);
        System.out.println("EVEN SUM "+sumEven);
        System.out.println("ODD SUM "+sumOdd);

    }
    
}
