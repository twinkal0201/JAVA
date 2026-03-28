import java.util.Scanner;

public class OddEvenWOMod {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            if((n & 1) == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }
}

