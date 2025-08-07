import java.util.Iterator;
import java.util.Scanner;
 
public class Solution {
    // 델타 배열 선언
    static int dr[] = { 0, 1, 0, -1 };
    static int dc[] = { 1, 0, -1, 0 };
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SWEA 테스트케이스 처리
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            // 입력
            // N*N 배열의 길이 N
            int N = sc.nextInt();
 
            // 로직
            // 달팽이의 정보
            // 달팽이의 좌표위치, 달팽이의 방향, 달팽이의 칸의 수
            int r = 0, c = 0;
            int dir = 0;
            int step = 0;
 
            // 이차원 배열 N * N 선언 및 초기화
            int[][] arr = new int[N][N];
             
            // 초기 시작 위치는 먼저 처리!
            arr[0][0] = ++step;
            // 실제로 달팽이를 이동시키면서 배열의 값을 변화...!
            // 반복문 step 이 N^2 가 될 때까지 반복...!
            while (step < N * N) {
                // - 현재의 방향으로 한 칸이동
                // 다음 좌표값 (nr, nc)
                int nr = r + dr[dir];
                int nc = c + dc[dir];
                // - 이동이 불가능한 경우
                // (배열 바깥 OR 이미 값이 채워져 있는 경우!)
                if (nr < 0 || nc < 0 || nr >= N || nc >= N || arr[nr][nc] != 0) {
                    // 방향 전환! (다음방향!)
                    dir = (dir + 1) % 4;
                    // 방향 전환 위치로 한칸 이동!
                    nr = r + dr[dir];
                    nc = c + dc[dir];
                }
                // 달팽이 먼저 이동!
                // 배열에 발자취 남기기 (달팽이의 숫자 기록)
                r = nr;
                c = nc;
                arr[r][c] = ++step;
            }
 
            // 출력 : 달팽이 배열 출력
            // 테스트 케이스를 출력
            System.out.println("#" + tc);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(arr[i][N - 1]);
            }
        }
    }
}