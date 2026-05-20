import java.util.Scanner;

public class Array_2d {
    public static void main(String[] args) {
        int [][] mat={{1,2,3},{4,5,6},{7,8,9}};
        // Scanner sc=new Scanner(System.in);
        // for(int row=0;row<3;row++){
        //     for(int col=0;col<3;col++){
        //         mat[row][col]=sc.nextInt();
        //     }
        // }
        System.out.println("output:");
        // for(int row=0;row<3;row++){
        //     for(int col=0;col<3;col++){
        //         System.out.print(mat[row][col]+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0;i<3;i++){
        //     if(i%2==0){
        //         for(int j=0;j<3;j++){
        //            System.out.print(mat[i][j]+" "); 
        //         }
        //     }
        //     else{
        //         for(int j=2;j>=0;j--){
        //            System.out.print(mat[i][j]+" "); 
        //         }
        //     }
        //     System.out.println();
        // }
            // for(int col=0;col<3;col++){
            //     for(int row=0;row<3;row++){
            //         System.out.print(mat[row][col]+" ");
            //     }
            //     System.out.println();
            // }

            for(int i=0;i<3;i++){
            if(i%2!=0){
                for(int j=0;j<3;j++){
                   System.out.print(mat[j][i]+" "); 
                }
            }
            else{
                for(int j=2;j>=0;j--){
                   System.out.print(mat[j][i]+" "); 
                }
            }
            System.out.println();
        }

    }
}
