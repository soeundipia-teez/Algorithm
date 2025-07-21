import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        
        double area = (w * h / 2.0);
        
        System.out.printf("%.1f", area);
    }
}