import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // 로직
            // 단조 증가가 아닐 경우 -1
            int max = -1;

            // 모든 쌍을 확인
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    int num = arr[i] * arr[j];
                    String s = String.valueOf(num);
                    
                    // 단조 증가 여부 확인
                    boolean ok = true;
                    for (int k = 0; k < s.length() - 1; k++) {
                        // 단조증가가 아닐 경우
                        if (s.charAt(k) > s.charAt(k + 1)) {
                            ok = false;
                            break;
                        }
                    }
                    // 단조증가이면서 num의 값이 max 보다 큰 경우
                    if (ok && num > max) {
                        max = num; // max의 값을 num으로
                    }
                }
            }

            // 출력
            System.out.println("#" + tc + " " + max);
        }
    }
}