package College.Recursion.Recursion;

public class Armstrong {
    static void armstrong(int num, int sum, int copy) {
        if (num == 0) {
            System.err.println(sum == copy ? "Armstrong Number" : "Not Armstromg Number");
            return;
        }
        int digit = num % 10;
        int cube = digit * digit * digit;
        sum = sum + cube;
        armstrong(num / 10, sum, copy);
    }

    public static void main(String[] args) {
        int num = 1;
        armstrong(num, 0, num);

    }
    //

}
