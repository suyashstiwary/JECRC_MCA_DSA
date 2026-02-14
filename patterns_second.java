
public class patterns_second {
    public static void main(String[] args) {
        int n=7;
        // Q1
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++)System.out.print(" ");
        //     for(int j=1;j<=2*i-1;j++)System.out.print("*");
        //     for(int j=1;j<=n-i+1;j++)System.out.print(" ");
        //     System.out.println("");
            
        // }

        // Q3
        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j=1;j<=i;j++)System.out.print("*");
            }
            else{
                
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}
