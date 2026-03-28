import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a:");
        int a= sc.nextInt();
        System.out.println("enter b:");
        int b= sc.nextInt();
         int result = 1;

        for(int i = 0; i < b; i++) {
            int temp = 0;
            for(int j = 0; j < a; j++) {
                temp += result;   
            }
            System.out.println(temp);
            result = temp;
        }
        System.out.println("Power = " + result);
    }
}

