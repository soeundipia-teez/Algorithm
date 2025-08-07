import java.util.Scanner;
import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 테스트 케이스
        for (int tc = 1; tc <= 10; tc++) {
            // 테스트 케이스의 길이와 문자열 입력받음
            int length = sc.nextInt();
            String text = sc.next();

            // ArrayDeque를 활용한 스택 생성
            ArrayDeque <Character> stack = new ArrayDeque<>();

            // 괄호 짝 검사 유효성 여부
            boolean isValid = true;

            // 괄호 짝 검사순서
            // 문자열에 대해 왼쪽 -> 오른쪽 순서로 검사 (순회)
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                // 여는 괄호를 만나면 스택에 삽입
                if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                    stack.push(ch);
                } else {
                    // 스택에 아무것도 없을 경우 -> 유효성X
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    // 스택에 있는 값과 pop하여 짝이 맞는지 확인
                    char top = stack.pop();
                    if ((ch == ')' && top == '(') || (ch == '}' && top == '{') ||
                            (ch == ']' && top == '[') || (ch == '>' && top == '<')) {
                        continue;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            // 순회가 모두 끝나고 스택이 비어있는지 확인
            if (stack.isEmpty()) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }
        }
    }
}
