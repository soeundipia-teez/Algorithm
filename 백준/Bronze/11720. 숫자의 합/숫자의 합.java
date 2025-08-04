import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();           // 숫자의 개수 입력
        String numbers = sc.next();     // 공백 없이 숫자들을 문자열로 입력받음

        int sum = 0;

        for (int i = 0; i < N; i++) {
            // 문자를 숫자로 변환하여 더함
            sum += numbers.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
