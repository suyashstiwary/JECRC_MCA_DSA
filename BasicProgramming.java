import java.util.*;

public class BasicProgramming {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Input:");
        // Q2. print the table of 7
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a*i);
        }
        //Q9. leap year
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||year%400==0){
            System.out.println("leap year");
        }
        else System.out.println("not a leap year");

        // Reverse the Digits
        int num=sc.nextInt();
        int ans=0;
        while(num!=0){
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        System.out.println(ans);
    }
}