package array;

/**
 * 计算两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @Date 2020-12-08
 * @Auth zhangkun
 */
public class TwoSum {

    /**
     * 第一种方法：使用暴力破解法，所谓的暴力法就是对数组进行多次遍历
     *
     * @param nums   数组
     * @param target 目标值
     * @return
     */
    private static int[] testOne(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("i:" + nums[i] + " j:" + nums[j]);
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int target = 9;
        // 初始化一个数组
        int[] intArray = new int[]{2, 11, 15, 7};
        int[] ints = testOne(intArray, target);
        System.out.println("====================");
        for (int i : ints) {
            System.out.println(i);
        }

    }
}
