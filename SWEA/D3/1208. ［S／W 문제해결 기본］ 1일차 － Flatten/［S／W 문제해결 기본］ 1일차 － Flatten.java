import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         
        for (int test_case = 1; test_case <= 10; test_case++) {
            int dump = sc.nextInt(); // 덤프의 횟수
            int[] box = new int[100];
             
            // 박스 높이 입력받음
            for (int i = 0; i < 100; i++) {
                box[i] = sc.nextInt();
            }
             
            // 덤프 수행
            for (int j = 0; j < dump; j++) {
                int maxIdx = 0; // 최고점 선언 및 초기화
                int minIdx = 0; // 최저점 선언 및 초기화
                 
                for (int k = 1; k < 100; k++) {
                    if (box[k] > box[maxIdx]) {
                        maxIdx = k;
                    }
                    if (box[k] < box[minIdx]) {
                        minIdx = k;
                    }
                }
                 
                // 평탄화가 완료 되었는지 확인
                if (box[maxIdx] - box[minIdx] <= 1) {
                    break;
                }
                 
                // 덤프 수행
                box[maxIdx]--;
                box[minIdx]++;
            }
             
            // 최종적으로 최고점과 최저점의 차이 계산
            int max = box[0]; // 최고점의 값 선언 및 초기화
            int min = box[0]; // 최저점의 값 선언 및 초기화
            for (int i = 1; i < 100; i++) {
                if (box[i] > max) {
                    max = box[i];
                }
                if (box[i] <min) {
                    min = box[i];
                }
            }
             
            // 결과 출력
            System.out.println("#" + test_case + " " + (max - min));
        }
    }
}