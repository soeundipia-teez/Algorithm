import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jh = sc.nextLine();
        String doctor = sc.nextLine();

        if (jh.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}