public class Maths4 {

     public static void pascalTriangle(int rows) {
        System.out.println("Pascal Triangle:");
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

       
        pascalTriangle(5);

        System.out.println();

        // 2.
        char ch = 'A';
        int x = ch;
        System.out.println("Output of char to int: " + x);

        // 3.
        System.out.println("Output of 'A' + 1: " + ('A' + 1));

        // 4.
        int a = 5;
        double b = 2;
        System.out.println("Output of a + b: " + (a + b));

        // 5.
        System.out.println("Output of 5 + 2 + \"Hello\": " + (5 + 2 + "Hello"));

        // 6.
        double result = 10.0 / 3;
        System.out.printf("10/3 rounded to 3 decimal places: %.3f", result);
    }
}