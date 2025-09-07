import java.util.Scanner;

public class Solution {

    static int[] arr;
    static int[] temp;

    public static void mergeSort(int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(left, mid);
        mergeSort(mid + 1, right);

        merge(left, mid, right);
    }

    public static void merge(int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int x = left; x <= right; x++) {
            arr[x] = temp[x];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        arr = new int[1000000];
        temp = new int[1000000];

        for (int i = 0; i < 1000000; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(0, arr.length - 1);

        System.out.println(arr[500000]);
    }
}