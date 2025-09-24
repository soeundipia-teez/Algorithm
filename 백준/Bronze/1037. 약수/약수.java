import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        int[] real = new int[count];
        
        for (int i = 0; i < count; i++) {
            real[i] = sc.nextInt();
        }
        
        Arrays.sort(real);  // 약수 배열 정렬
        
        int N = real[0] * real[count - 1];  // 최소 * 최대
        
        System.out.println(N);
    }
}