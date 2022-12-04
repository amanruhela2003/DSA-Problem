package College;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=n;
        int sum=0;
        //int m=0;
        while(a!=0)

        {
            a=a/10;
            sum++;

        }

        System.out.println(sum);
        scanner.close();
        a=n;
        int pow=1;
        while(a!=0)
        {
            a=a/10;
            pow=pow*10;
        }

        while(a!=0)
        {
            System.out.println(a/pow);
            a=a%pow;
            pow=pow/10;
        }

    }
    
}
