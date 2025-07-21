import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int sum = (n * 100);
        
        if (sum >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}