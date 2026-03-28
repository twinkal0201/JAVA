import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Not Ugly Number");
            return;
        }

        // Divide by 2
        while(n % 2 == 0) {
            n /= 2;
        }

        // Divide by 3
        while(n % 3 == 0) {
            n /= 3;
        }

        // Divide by 5
        while(n % 5 == 0) {
            n /= 5;
        }

        if(n == 1)
            System.out.println("Ugly Number");
        else
            System.out.println("Not Ugly Number");
    }
}