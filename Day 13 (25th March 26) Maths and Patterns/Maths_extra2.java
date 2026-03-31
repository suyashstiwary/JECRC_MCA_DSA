import java.util.Scanner;

public class Maths_extra2 {
    public static void main(String[] args) {
        // int count=0;
        // int n=36;
        // for(int i=1;i*i<=n;i++){
        //     if(n%i==0){
        //         if(n/i==i)count++;
        //         else count+=2;
        //     }
        // }
        // System.out.println(count);

        // int a=25,b=35;
        // while(a>0&&b>0){
        //     if(a>b)a=a%b;
        //     else b=b%a;
        // }
        // if(a==0)System.out.println(b);
        // else System.out.println(a);

        // int binary = 110011;
        // int decimal = 0;
        // int count = 0;
        // while (binary > 0) {
        //     int lastDigit = binary % 10;
        //     decimal += lastDigit * Math.pow(2, count);
        //     count++;
        //     binary/=10;

        // }
        // System.out.println(decimal);

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter binary number: ");

        // int binary = sc.nextInt();

        // int decimal = 0, base = 1;

        // while (binary > 0) {

        //     int multiplier = binary % 10;

        //     decimal = decimal + multiplier * base; // decimal = decimal + multiplier * Math.pow(2,count);

        //     base = base * 2;// count++;

        //     binary = binary / 10;

        // }
        //System.out.println("Decimal = " + decimal);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int n = sc.nextInt();

        System.out.print("Prime factors: ");
        int num=n;

        for (int i = 2; i*i <= n; i++) {

            while (num % i == 0) {

                System.out.print(i + " ");

                num = num / i;

            }
        }
        if(num>1)System.out.println(num);
    }
}
