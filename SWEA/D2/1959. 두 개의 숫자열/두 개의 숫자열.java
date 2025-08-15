import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            // N과 M의 값 입력받음
            int N = sc.nextInt();
            int M = sc.nextInt();

            // 배열의 크기가 각각 N과 M인 배열 생성
            int[] A = new int[N];
            int[] B = new int[M];

            // A의 값과 B의 값을 입력 받아 배열을 채움
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            for (int j = 0; j < M; j++) {
                B[j] = sc.nextInt();
            }

            // 로직
            // sum 값들 중에서 최댓값을 저장할 maxSum 선언 및 초기화
            // 음수 값이 나올 수 있으므로 Integer.MIN_VALUE 사용
            int maxSum = Integer.MIN_VALUE;

            // 1. N < M의 경우,
            if (N < M) {
                for (int move = 0; move < M - N + 1; move++) {
                    int sum = 0;
                    for (int k = 0; k < N; k++) {
                        sum += A[k] * B[k + move];
                    }
                    // sum의 값이 maxSum보다 클 경우 해당 값을 저장
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            } else {
                for (int move = 0; move < N - M + 1; move++) {
                    int sum = 0;
                    for (int k = 0; k < M; k++) {
                        sum += A[k + move] * B[k];
                    }
                    // sum의 값이 maxSum보다 클 경우 해당 값을 저장
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
            // 출력
            System.out.println("#" + tc + " " + maxSum);
        }
    }
}