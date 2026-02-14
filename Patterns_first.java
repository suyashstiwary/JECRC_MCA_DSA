import java.util.Scanner;

public class Patterns_first {
    public static Boolean isPrime(int n){
        Boolean flag=true;
        if(n<2){
            System.out.println("Neither Prime nor Composite");
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0)flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        // print prime from 1 to n Q1
        // for(int i=2;i<=n;i++){
        //     if(isPrime(i)==true)System.out.println(i);
        // }

        // Q2 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        // Q3
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // Q4
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // Q5
        
    }
}
