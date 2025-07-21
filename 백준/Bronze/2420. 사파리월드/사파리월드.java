import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long result = n - m;
        
        if (result >= 0) {
            System.out.println(result);
        } else {
            System.out.println(result * (-1));
        }
    }
}