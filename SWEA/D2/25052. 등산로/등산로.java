import java.util.Scanner;

public class Solution {
	
	static int N;
	static int[][] map;
	static int[][] dp;
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new int[N][N];
			dp = new int[N][N];
			
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			int answer = 0;
			
			for (int r = 0; r < N; r ++) {
				for (int c = 0; c < N; c++) {
					answer = Math.max(answer, dfs(r, c));
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
		
		sc.close();
	}
	
	static int dfs(int r, int c) {
		if (dp[r][c] != 0) return dp[r][c];
		
		int minHeight = Integer.MAX_VALUE;
		int nr = -1;
		int nc = -1;
		
		for (int d = 0; d < 4; d++) {
			int tr = r + dr[d];
			int tc = c + dc[d];
			
			if  (tr < 0 || tc < 0 || tr >= N || tc >= N) continue;
			
			if (map[tr][tc] < map[r][c]) {
				if (map[tr][tc] < minHeight) {
					minHeight = map[tr][tc];
					nr = tr;
					nc = tc;
				}
			}
		}
		
		if (nr == -1) {
			dp[r][c] = 1;
		} else {
			dp[r][c] = 1 + dfs(nr, nc);
		}
		
		return dp[r][c];
	}
}