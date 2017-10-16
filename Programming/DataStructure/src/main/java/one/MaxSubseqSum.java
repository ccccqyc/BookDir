package one;

import java.util.Scanner;

/**
 * 第一周的编程作业：
 * 最大子列和问题
 * Created by q on 17-10-16.
 */
public class MaxSubseqSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = maxsubseqsum(arr, length);
        if (sum < 0) {
            sum = 0;
        }
        System.out.print(sum);
    }

    public static int maxsubseqsum(int[] arr, int length) {
        int thisSum = 0, maxSum = 0, i;
        for (i = 0; i < length; i++) {
            thisSum += arr[i];
            if (thisSum > maxSum) {
                maxSum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return maxSum;
    }
}
