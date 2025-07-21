import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int sum = (a + b + c + d);
        
        int min = sum / 60;
        int sec = sum % 60;
        
        System.out.println(min);
        System.out.println(sec);
    }
}