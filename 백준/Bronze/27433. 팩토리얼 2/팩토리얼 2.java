import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        long fac = 1;
        
        if (n <= 1) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= n; i++) {
                fac = fac * i;
            }
            System.out.println(fac);
        }
    }
}