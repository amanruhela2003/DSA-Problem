package College;

import java.util.Scanner;


public class RotateNumber {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt(); //num-->number to rotate
    System.out.println("Enter the rotation r: ");
    int r=sc.nextInt();  //r--> no. about which no. get rotate
    sc.close();

    int temp=num;
    int count=0;// no of digits
    while(temp>0)
    {
        temp=temp/10;
        count++;
    }

    r=r%count; //it handle if rotation is greater than count
    if(r<0)
    {
        r=r+count;//it handle if rotation is negative
    }
    int div=1;
    int mul=1;
    for(int i=1;i<=count;i++)
    {
        if(i<=r)
        {
            div=div*10;
        }
        else
        {
            mul=mul*10;
        }

    }
    int q=num/div;
    int k=num%div;
    int rot_num=k*mul+q;
    System.out.println("Rotated no: "+rot_num);   
}
}