public class DoubtSession1 {
    // public int BinarytoDecimal(int i){

    //     int dec = 0;

    //     int rem;

    //     int power =1;

    //     while(i>0){

    //         rem = i%10;

    //         dec += (rem * power);

    //         i = i/10;

    //         power *= 2;

    //     }

    //     return dec;

    // }

    public int fact(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            num*=i;
        }
        return num;
    }
    public void main(String[] args) {
        // int a=1001;
        // // int dec1=BinarytoDecimal(a);
        // // System.out.println(dec1);
        // int n=3;
        // for(int i=0;i<=n;i++){
        //     System.out.print((fact(n)/(fact(i)*fact(n-i)))+" ");
        // }

        int n=4;
         for(int i=0;i<=n;i++){

            int ans = 1;

            for(int j=0;j<=i;j++){

                ans = fact(i)/(fact(j) * fact(i-j));

                System.out.print(ans + " ");

            }

            System.out.println();

        }

    }
}
