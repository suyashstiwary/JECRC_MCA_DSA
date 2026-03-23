class Functions {
    // public static int decimalToBinary(int a){
    //     int ans=0;
    //     while(a>0){
    //         int rem=a%2;
    //         ans=ans*10+rem;
    //         a=a/2;
    //     }
    //     int rev=0;
    //     while(ans>0){
    //         int digit=ans%10;
    //         rev=rev*10+digit;
    //         ans=ans/10;
    //     }
    //     return rev;
    // }
    
    public static void primeFactor(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>1)System.out.println(n);
    }
    public static void main(String[] args) {
        // System.out.println(decimalToBinary(23));
        // System.out.println();
        primeFactor(16);
        
    }
}