import java.util.Scanner;

public class MaxMinAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num > max) max = num;
            if(num < min) min = num;

            sum += num;
        }

        double avg = (double) sum / n;

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Average = " + avg);
    }
}