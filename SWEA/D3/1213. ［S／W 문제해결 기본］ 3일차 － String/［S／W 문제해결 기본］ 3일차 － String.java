import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         
        for (int test_case = 1; test_case <= 10; test_case++) {
            String tc = sc.nextLine(); // 테스트 케이스 번호 입력
            String pattern = sc. nextLine(); // 검색할 문자열 입력
            String text = sc.nextLine(); // 주어지는 영어 문장 입력
             
            int count  = 0; // 문자열이 나오는 횟수 저장할 변수 선언 및 초기화
             
            // Brute Force 방식
            // text의 i번째 위치부터 pattern 길이만큼 비교
            for (int i = 0; i <= text.length() - pattern.length(); i++) {
                boolean isMatch = true; // 현재 위치에서 패턴이 일치하는지 확인하기 위한 변수
                 
                // 패턴의 각 문자와 일치하는지 여부 확인
                for (int j = 0; j < pattern.length(); j++) {
                    // 하나라도 다른 것이 있다면 false, 비교 중단
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }
                // 패턴이 완전히 일치할 경우 count 값 증가
                if (isMatch) {
                    count++;
                }
            }
            // 출력
            System.out.println("#" + tc + " " + count);
        }
    }
}