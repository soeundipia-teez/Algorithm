// StringBuilder 사용한 코드
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt(); // 테스트 케이스 T 입력받음
        sc.nextLine(); // 개행문자 제거필요
 
        // 테스트 케이스만큼 진행
        for (int tc = 1; tc <= T; tc++) {
            String word = sc.nextLine(); 
 
            // 회문된 경우 if문 실행, 회문되지 않은 경우 else문 실행
            if (Palindrome(word)) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }
        }
    }
 
    // StringBuilder를 이용한 회문
    public static boolean Palindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}