import java.util.Scanner;

public class Solution {
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
            // 계곡의 개수 선언 및 초기화
            int valleyCount = 0;

            for (int r = 1; r < N - 1; r++) {
                for (int c = 1; c < N - 1; c++) {
                    boolean isValley = true;

                    // 상하좌우 4개의 방향 탐색
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];

                        if (map[nr][nc] <= map[r][c]) {
                            isValley = false;
                            break;
                        }
                    }
                    if (isValley) {
                        valleyCount++;
                    }
                }
            }
            System.out.println("#" + tc + " " + valleyCount);
        }
    }
}