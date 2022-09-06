import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分。
 * 示例 1：
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 */
public class LeeCode0053 {

  public int maxSubArray(int[] nums) {
    int length = nums.length;
    int[] dp = new int[length];
    // base case
    // 第一个元素前面没有子数组
    dp[0] = nums[0];
    for (int i = 1; i < length; i++) {
      dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
    }
    int result = Integer.MIN_VALUE;
    for (int i : dp) {
      result = Math.max(result, i);
    }
    return result;
  }

  public static void main(String[] args) {
    int i = new LeeCode0053().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    System.out.println(i);
  }
}
