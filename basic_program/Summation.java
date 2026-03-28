import java.util.Scanner;

class Summation{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int ans=0;
        while (n!=0) {
            int a=n%10;
            n=n/10;
            ans+=a;
        }
        System.out.println(ans);
    }

     static int sum(int n) {
        if(n == 0)
            return 0;
        return (n % 10) + sum(n / 10);
    }
}