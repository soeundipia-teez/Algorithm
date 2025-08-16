import java.util.Scanner;

public class Solution {
    // 델타탐색 : 우,하,우하,우상
    static int[] dr = {0, 1, 1, -1};
    static int[] dc = {1, 0, 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();

            char[][] board = new char[N][N];
            for (int i = 0; i < N; i++) {
                String line = sc.next();
                for (int j = 0; j < N; j++) {
                    board[i][j] = line.charAt(j);
                }
            }

            // 로직
            boolean found = false;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (board[r][c] == 'o') {

                        for (int d = 0; d < 4; d++) {
                            int count = 1; // 현재 돌 포함하여 시작
                            int nr = r;
                            int nc = c;

                            while (true) {
                                nr += dr[d];
                                nc += dc[d];

                                // board의 범위를 벗어나면 중단
                                if (nr < 0 || nc < 0 || nr >= N || nc >= N) {
                                    break;
                                }

                                // 범위 내에서 돌의 개수 카운트
                                if (board[nr][nc] == 'o') {
                                    count++;

                                    // 찾은 돌의 개수가 5개가 될 경우 true 값 반환 후 종료
                                    if (count >= 5) {
                                        found = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            // 출력
            if (found) {
                System.out.println("#" + tc + " " + "YES");
            } else {
                System.out.println("#" + tc + " " + "NO");
            }
        }
    }
}