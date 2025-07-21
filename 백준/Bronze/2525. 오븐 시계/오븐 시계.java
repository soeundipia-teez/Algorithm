import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int min = b + c;
        
        if (min <= 59) {
            System.out.println(a + " " + min);
        } else {
            int hour = a + (min / 60);
            
            if (hour >= 24) {
                System.out.println((hour - 24) + " " + (min % 60));
            } else {
                System.out.println((hour) + " " + (min % 60));
            }
        }
    }
}