import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a == b && b == c) {
            int sum1 = 10000 + a * 1000;
            System.out.println(sum1);
        } else if (a == b || a == c) {
            int sum2 = 1000 + a * 100;
            System.out.println(sum2);
        } else if (b == c && a != b) {
            int sum3 = 1000 + b * 100;
            System.out.println(sum3);
        } else {
            if (a > b && a > c) {
                int sum4 = a * 100;
                System.out.println(sum4);
            } else if (b > a && b > c) {
                int sum5 = b * 100;
                System.out.println(sum5);
            } else {
                int sum6 = c * 100;
                System.out.println(sum6);
            }
        }
    }
}