import java.util.Scanner;

public class Solution {
    // 상하좌우 델타배열
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[][] map = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            // 봉우리 개수 변수 선언 및 초기화
            int peakCount = 0;

            // 모든 산의 높이 확인
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    // 봉우리라고 가정
                    boolean isPeak = true;

                    // 상하좌우 4개의 방향 탐색
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];

                        // 지도 범위 내에 있으면서, 더 높거나 같은 산의 높이가 있다면 봉우리 아님
                        if (nr >= 0 && nc >= 0 && nr < N && nc < N) {
                            if (map[nr][nc] >= map[r][c]) {
                                isPeak = false;
                                break;
                            }
                        }
                    }
                    // 봉우리일 경우 peakCount의 값 1 증가
                    if (isPeak) {
                        peakCount++;
                    }
                }
            }
            System.out.println("#" + tc + " " + peakCount);
        }
    }
}