import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();

            // 배열의 크기가 N인 배열 A, B 생성
            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int j = 0; j < N; j++) {
                B[j] = sc.nextInt();
            }

            // 로직
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] != B[i]) {
                    count++;

                    for (int j = i; j < N; j++) {
                        A[j] = 1 - A[j];
                    }
                }
            }
            
            // 출력
            System.out.println("#" + tc + " " + count);
        }
    }
}