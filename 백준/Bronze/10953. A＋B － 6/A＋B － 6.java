import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            String[] arr = sc.next().split(",");
            
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            
            System.out.println(A + B);
        }
    }
}