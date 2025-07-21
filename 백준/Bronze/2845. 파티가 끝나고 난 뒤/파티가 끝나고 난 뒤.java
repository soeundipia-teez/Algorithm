import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int P = sc.nextInt();
        
        int LP = L * P;
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        System.out.print((a - LP) + " ");
        System.out.print((b - LP) + " ");
        System.out.print((c - LP) + " ");
        System.out.print((d - LP) + " ");
        System.out.print(e - LP);
    }
}