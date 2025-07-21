import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int p = scanner.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= c; i++) {
            sum = sum + (k * i) + (p * i * i);
        }
        System.out.println(sum);
    }
}