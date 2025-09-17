import java.util.Scanner;

public class Main {
	
	static int N, S;
	static int[] arr;
	static int count = 0;
	
	// dfs 함수
	// depth : 현재 보고 있는 인덱스의 위치
	// sum : 지금끼지 선택한 원소들의 합
	static void dfs(int depth, int sum) {
		// 모든 원소들의 값을 다 확인했을 경우
		if (depth == N) {
			// 현재까지의 합이 S와 같은 경우 count의 값을 증가시킴
			if (sum == S) {
				count++;
			}
			return; // 탐색종료
		}
		
		// 1. 현재 원소를 선택하는 경우
		// sum에 arr[depth]를 더해주고 다음 인덱스로 이동
		dfs(depth + 1, sum + arr[depth]);
		
		// 2. 현재 원소를 선택하지 않는 경우
		// sum을 그대로 두고 다음 인덱스로 이동
		dfs(depth + 1, sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		
		// N크기의 배열 생성 후 수열의 값 입력받고 저장
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// dfs 탐색 시작 (0번째 원소, 합이 0)에서 시작함
		dfs(0, 0);
		
		// 아무것도 선택하지 않은 공집합은 제외
		if (S == 0) {
			count--;
		}
		
		// 결과출력
		System.out.println(count);
		
		sc.close();
	}
}