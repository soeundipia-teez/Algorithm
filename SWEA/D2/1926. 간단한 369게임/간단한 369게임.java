import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int N = sc.nextInt();
        
        // 로직
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    count++;
                }
            }

            // 출력
            if (count == 0) {
                System.out.print(s);
                System.out.print(" ");
            } else {
                for (int k = 0; k < count; k++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            }
        }
    }
}