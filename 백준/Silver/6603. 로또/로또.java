import java.util.Scanner;

public class Main {
	
	static int k;
	static int[] S;
	
	static void combination(int[] S, int start, int[] result, int depth) {
		if (depth == 6) {
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = start; i < S.length; i++) {
			result[depth] = S[i];
			combination(S, i + 1, result, depth + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			k = sc.nextInt();
			if (k == 0) break;
			
			S = new int[k];
			for (int i = 0; i < k; i++) {
				S[i] = sc.nextInt();
			}
			
			combination(S, 0, new int[6], 0);
			System.out.println();
		}
		
		sc.close();
	}
}