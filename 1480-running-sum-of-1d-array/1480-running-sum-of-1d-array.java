import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];

        runningSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        RunningSum runningSum = new RunningSum();
        int[] result = runningSum.runningSum(nums);
        System.out.println("Running Sum: " + Arrays.toString(result));
    }
}
