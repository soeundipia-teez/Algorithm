import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        for (int test_case = 1; test_case <= 10; test_case++) {
            // 100 * 100 크기의 평면글자판 생성
            char[][] board = new char[100][100];
 
            // 테스트케이스 입력받기
            int tc = sc.nextInt();
 
            // 문자 입력받기 : 100줄을 입력 받고 각 줄의 문자를 배열에 저장
            for (int i = 0; i < 100; i++) {
                String line = sc.next();
                for (int j = 0; j < 100; j++) {
                    board[i][j] = line.charAt(j);
                }
            }
 
            // 회문 길이를 저장할 수 있는 변수선언 및 초기화
            int maxLength = 1;
 
            // 가로방향 회문 검사
            for (int row = 0; row < 100; row++) {
                for (int start = 0; start < 100; start++) {
                    for (int end = start + 1; end < 100; end++) {
                        // row행의 start 값부터 end 까지의 문자열을 추출
                        String str = getRowString(board, row, start, end);
 
                        // 추출한 문자열이 회문인지 검사
                        if (isPalidrome(str)) {
                            int length = end - start + 1;
                            // 추출한 문자열의 길이가 maxLength 보다 크다면 해당 값으로 갱신
                            if (length > maxLength) {
                                maxLength = length;
                            }
                        }
                    }
                }
            }
 
            // 세로방향 회문 검사
            for (int col = 0; col < 100; col++) {
                for (int start = 0; start < 100; start++) {
                    for (int end = start + 1; end < 100; end++) {
                        // col열의 start 값부터 end 까지의 문자열을 추출
                        String str = getColString(board, col, start, end);
 
                        // 추출한 문자열이 회문인지 검사
                        if (isPalidrome(str)) {
                            int length = end - start + 1;
                            // 추출한 문자열의 길이가 maxLength 보다 크다면 해당 값으로 갱신
                            if (length > maxLength) {
                                maxLength = length;
                            }
                        }
                    }
                }
            }
 
            // 결과 출력
            System.out.println("#" + tc + " " + maxLength);
        }
    }
 
    // 회문 확인 함수
    public static boolean isPalidrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
 
    // 가로방향 문자열 추출 함수
    static String getRowString(char[][] board, int row, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(board[row][i]);
        }
        return sb.toString();
    }
 
    // 세로방향 문자열 추출 함수
    static String getColString(char[][] board, int col, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(board[i][col]);
        }
        return sb.toString();
    }
}