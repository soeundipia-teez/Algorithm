import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 수
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt(); // 배열의 크기
            int M = sc.nextInt(); // 파리채의 크기

            int[][] arr = new int[N][N];

            // 배열의 값 입력받음
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // 최대로 죽일 수 있는 파리의 수
            int maxKill = 0;

            // 처음 파리채의 위치를 왼쪽 위 모서리로
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    // 파리채로 잡은 파리의 수
                    int sum = 0;

                    // M * M 범위의 합 구하기
                    for (int r = i; r < i + M; r++) {
                        for (int c = j; c < j + M; c++) {
                            sum += arr[r][c];
                        }
                    }

                    // 잡은 파리의 수를 가장 큰 수로 갱신
                    if (sum > maxKill) {
                        maxKill = sum;
                    }
                }
            }
            // 결과 출력
            System.out.println("#" + tc + " " + maxKill);
        }
    }
}