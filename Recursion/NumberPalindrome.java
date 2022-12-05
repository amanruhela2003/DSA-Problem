package College.Recursion.Recursion;

import java.util.ArrayList;

public class NumberPalindrome {

    static ArrayList<Integer> getAllPalindrome(int n, int i){
        if(i==n){
            return new ArrayList<Integer>();    
        }
       
        ArrayList<Integer> list  = getAllPalindrome(n,i+1);
        boolean result = CheckPalindrome(i, i,0);
        if(result){
            list.add(i);
        }
        return list;

    }

    static boolean CheckPalindrome(int num,int org,int rev)
    {
        if(num==0)
        {  if(rev==org)
            {
            return true;
            }
            return false;


        }
        rev=(rev*10)+(num%10);
        return CheckPalindrome(num/10, org,rev);
    }

        public static void main(String[] args) {
            ArrayList<Integer> list = getAllPalindrome(1023, 1);
            System.out.println(list);

        }


    
}
