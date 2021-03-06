package array;

/**
 * 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class MaxSubArray {


    public static int testOne(int[] nums) {

        int pre = 0, maxAns = nums[0];
        for (int x : nums){
            pre = Math.max(pre+ x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int num = testOne(nums);
        System.out.println("====================" + num);

    }
}
