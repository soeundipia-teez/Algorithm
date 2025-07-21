import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        if (B >= C) {
            System.out.println((int)(A * B / C));
        } else {
            System.out.println((int)(A / B * C));
        }
    }
}