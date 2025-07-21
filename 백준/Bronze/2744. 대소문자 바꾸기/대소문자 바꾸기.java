import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();
        String answer = "";
        
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            
            if (Character.isUpperCase(a)) {
                answer += Character.toLowerCase(a);
            } else {
                answer += Character.toUpperCase(a);
            }
        }
        System.out.println(answer);
    }
}