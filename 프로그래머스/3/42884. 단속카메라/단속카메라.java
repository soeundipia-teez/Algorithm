import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // 차량 경로를 진출 지점(끝 지점)을 기준으로 오름차순 정렬
        Arrays.sort(routes, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        
        int answer = 0;
        int camera = Integer.MIN_VALUE; // 마지막 카메라 설치 위치
        
        for (int i = 0; i < routes.length; i++) {
            // 현재 차량의 진입 지점이 마지막 카메라보다 뒤라면 새로운 카메라 설치
            if (routes[i][0] > camera) {
                camera = routes[i][1];
                answer++;
            }
        }
        
        return answer;
    }
}
