import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        
        if (n == m) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}