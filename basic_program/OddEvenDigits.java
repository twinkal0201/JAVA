import java.util.Scanner;

public class OddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int odd = 0, even = 0;

        while(n != 0) {
            int digit = n % 10;
            if(digit % 2 == 0)
                even++;
            else
                odd++;
            n /= 10;
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}