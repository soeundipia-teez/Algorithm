import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 T 입력받음
        int T = sc.nextInt();

        // 테스트 케이스 1 부터 T 까지 반복
        for (int tc = 1; tc <= T; tc++) {
            // 수열의 길이 N 입력받음
            int N = sc.nextInt();
            // 0과 1로 아루어진 수열 입력받음
            String numbers = sc.next();

            // 1의 개수를 저장할 count와 가장 큰 count의 값을 저장할 maxCount 선언 및 초기화
            int count = 0;
            int maxCount = 0;
            for (int i = 0; i < N; i++) {
                // numbers에서 i번째에 있는 문자를 확인
                // 1. 해당 문자가 1과 같은 경우 -> count의 값을 1 증가
                // 1-1. 증가 후 count 값이 maxCount보다 크면 maxCount 값을 count로
                // 2. 해당 문자가 1과 다를 경우 -> count의 값을 0으로 초기화
                if (numbers.charAt(i) == '1') {
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println("#" + tc + " " + maxCount);
        }
    }
}