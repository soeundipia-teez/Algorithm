import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	static String s; // 입력 받은 괄호 문자열을 저장하는 변수
	static boolean isVPS; // VPS여부를 판별
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 케이스 수 입력
		sc.nextLine(); // 개행문자 제거
		
		for (int tc = 1; tc <= T; tc++) {
			s = sc.nextLine(); // 괄호문자열 한 줄 입력
			Stack<Character> stack = new Stack<>(); // 문자열을 저장할 스택 생성
			
			isVPS = true; // 초기값은 올바른 문자열 (true) 가정
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				
				// 여는 괄호가 나오면 스택에 push
				// 닫는 괄호가 나오면
				// 1. 스택이 비어있을 경우 false
				// 2. 스택에서 여는 괄호 pop
				// 탐색이 끝난 후에도 여는 괄호가 남아있으면 false
				if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					if (stack.isEmpty()) {
						isVPS = false;
						break;
					}
					
					stack.pop();
				}
			}
			
			if (!stack.isEmpty()) {
				isVPS = false;
			}
			
			// 결과 출력
			if (isVPS == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}