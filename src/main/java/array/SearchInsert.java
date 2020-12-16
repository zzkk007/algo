package array;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 *
 * @Date 2020-12-15
 * @Auth zhangkun
 */
public class SearchInsert {

    private static int testOne(int[] nums, int target) {
        if (nums[0] == target || target < nums[0]) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < target && nums[i] > target) {
                return i;
            } else if (nums[i] == target) {
                return i;
            }


        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int num = testOne(nums, 7);
        System.out.println("====================" + num);
        for (int i : nums) {
            System.out.println(i);
        }

    }
}
