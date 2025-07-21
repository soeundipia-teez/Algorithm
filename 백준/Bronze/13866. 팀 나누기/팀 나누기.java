import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int x = (a + d);
        int y = (b + c);
        
        if (x >= y) {
            System.out.println(x - y);
        } else {
            System.out.println(y - x);
        }
    }
}