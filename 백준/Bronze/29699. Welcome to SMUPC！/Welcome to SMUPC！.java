import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int remain = n % 14;
        
        if (remain == 1) {
            System.out.println("W");
        } else if (remain == 2 || remain == 7) {
            System.out.println("e");
        } else if (remain == 3) {
            System.out.println("l");
        } else if (remain == 4) {
            System.out.println("c");
        } else if (remain == 5 || remain == 9) {
            System.out.println("o");
        } else if (remain == 6) {
            System.out.println("m");
        } else if (remain == 8) {
            System.out.println("T");
        } else if (remain == 10) {
            System.out.println("S");
        } else if (remain == 11) {
            System.out.println("M");
        } else if (remain == 12) {
            System.out.println("U");
        } else if (remain == 13) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }
    }
}