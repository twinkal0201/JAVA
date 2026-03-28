import java.util.Scanner;

public class HourMinAngle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter Hour ");
        int Hour=sc.nextInt();
        System.out.println("enter Minute ");
        int Minute=sc.nextInt();

        double h_angle = Hour*30+Minute*0.5;
        double m_angle = Minute*6;
        double angle = Math.abs(h_angle - m_angle);


         if(angle > 180)
            angle = 360 - angle;
        System.out.println("Angle = " + angle);

    }
}
