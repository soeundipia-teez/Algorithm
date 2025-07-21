import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= (2 * n) - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}