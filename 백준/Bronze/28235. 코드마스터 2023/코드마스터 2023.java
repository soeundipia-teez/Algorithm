import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        
        if (name.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (name.equals("CODE")) {
            System.out.println("MASTER");
        } else if (name.equals("2023")) {
            System.out.println("0611");
        } else {
            System.out.println("CONTEST");
        }
    }
}