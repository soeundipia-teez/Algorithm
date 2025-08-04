import java.util.Scanner;
import java.util.Arrays;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
         
        for (int i = 1; i <= T; i++) {
            int[] arr = new int[10];
            int sum = 0;
             
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
             
            Arrays.sort(arr);
             
            for (int j = 1; j < 9; j++) {
                sum += arr[j];
            }
             
            int average = (int) Math.round(sum / 8.0);
            System.out.println("#" + i + " " + average);
        }
    }
}