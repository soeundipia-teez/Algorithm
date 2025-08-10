import java.util.Scanner;

public class Solution {
    // 델타 배열 (4방향) - + 모양
    static int[] dxPlus = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dyPlus = {0, 0, -1, 1};

    // 델타 배열 (대각선 4방향) - x 모양
    static int[] dxX = {-1, -1, 1, 1}; // 좌상, 우상, 좌하, 우하
    static int[] dyX = {-1, 1, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수 입력

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt(); // 배열 크기
            int M = sc.nextInt(); // 스프레이 세기

            int[][] arr = new int[N][N]; // 파리 수 저장할 배열
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int maxKill = Integer.MIN_VALUE; // 최대 파리 수 초기값 (아주 작은 값)

            // 모든 좌표를 중심으로 스프레이 뿌리기
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {

                    // + 모양으로 뿌리기
                    int sumPlus = arr[x][y]; // 중심 칸 파리 수
                    for (int d = 0; d < 4; d++) { // 상, 하, 좌, 우
                        for (int step = 1; step < M; step++) { // 1부터 M-1칸까지
                            int nx = x + dxPlus[d] * step;
                            int ny = y + dyPlus[d] * step;

                            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                                sumPlus += arr[nx][ny];
                            }
                        }
                    }
                    // x 모양으로 뿌리기
                    int sumX = arr[x][y];
                    for (int d = 0; d < 4; d++) { // 대각선 4방향
                        for (int step = 1; step < M; step++) {
                            int nx = x + dxX[d] * step;
                            int ny = y + dyX[d] * step;

                            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                                sumX += arr[nx][ny];
                            }
                        }
                    }
                    // 최대값 갱신 (Math.max() 안 쓰고 if문 사용)
                    if (sumPlus > maxKill) {
                        maxKill = sumPlus;
                    }
                    if (sumX > maxKill) {
                        maxKill = sumX;
                    }
                }
            }
            // 결과 출력
            System.out.println("#" + tc + " " + maxKill);
        }
    }
}