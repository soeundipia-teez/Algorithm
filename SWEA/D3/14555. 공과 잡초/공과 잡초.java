import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int T = sc.nextInt();
        sc.nextLine();

        for (int tc = 1; tc <= T; tc++) {
            String S = sc.nextLine();
            char[] arr = S.toCharArray();
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '(' || arr[i] == ')') {
                    count++;
                }
            }

            int pairCount = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == '(' && arr[i + 1] == ')') {
                    pairCount++;
                }
            }

            int ballCount = count - pairCount;

            System.out.println("#" + tc + " " + ballCount);
        }
    }
}