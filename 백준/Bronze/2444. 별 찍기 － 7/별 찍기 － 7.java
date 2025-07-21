import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println( );
        }

        for (int l = 1; l <= n; l++) {
            for (int m = 1; m <= l - 1; m++) {
                System.out.print(" ");
            }
            for (int o = l; o <= (2 * n) - l; o++) {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}