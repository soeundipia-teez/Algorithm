import java.util.Scanner;

public class Solution {
	
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        int sum = 0;

		for(int test_case = 1; test_case <= T; test_case++) {
            sum += test_case;
		}
        System.out.println(sum);
	}
}