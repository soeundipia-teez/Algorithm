import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            String line = sc.next();

            // 로직
            boolean found = false;

            for (int i = 0; i <= N - M; i++) {
                String str = line.substring(i , i + M);
                if (isPalidrome(str)) {
                    System.out.println("#" + tc + " " + str);
                    found = true;
                    break;
                }
            }
            // found의 값이 false인 경우
            if (!found) {
                System.out.println("#" + tc + " " + "NONE");
            }
        }
    }

    // 회문 확인 함수
    public static boolean isPalidrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}