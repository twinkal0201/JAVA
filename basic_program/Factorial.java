import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter a choice \n 1 for itrative \n 2 for recursive ");
        int n=sc.nextInt();

        System.out.println("enter factorial number:");
        int a=sc.nextInt();

        if (n==1){
        int ians=itrative(a);
        System.out.println("Ans with itrative is : "+ians);

        }
        else if(n==2){
        int rans=recursive(a);
        System.out.println("Ans with recursive is : "+rans);

        }
        else
            {
                System.out.println("enter valid choice");
            }

    }


    static int itrative(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
       return ans; 
    }

    static int recursive(int n){
        if(n==1){
            return 1;
        }
        return n*recursive(n-1);
    }
}