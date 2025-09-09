import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			
			int count = 0;
			
			// 2^N 계산
			int subsetCount = 1;
			for (int i = 0; i < N; i++) {
				subsetCount *= 2;
			}
			
			// 부분집합 탐색 (0은 공집합이므로 제외)
			for (int mask = 1; mask < subsetCount; mask++) {
				int sum = 0;
				int num = mask; // 현재 부분집합 번호
				int index = 0; // A배열 인덱스
				
				while (num > 0) {
					if (num % 2 == 1) { // 해당자리(비트)가 1이면 원소 선택
						sum += A[index];
					}
					
					num /= 2; // 오른쪽으로 이동
					index++;
				}
				
				if (sum == K) {
					count++;
				}
			}
			
			System.out.println("#" + tc + " " + count);
		}
		
		sc.close();
	}
}