package College;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //loop
        //for loop,while loop
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int evenCount=0;
        int oddCount=0;
        for( int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
        scanner.close();
    }
    
}
