package array;

import java.util.HashMap;

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
     *  时间复杂度：O(N^2) 其中 NN 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
     *
     * 空间复杂度：O(1)O(1)。
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

    /**
     * 第二种方法：两次遍历数组, 以空间复杂度代替时间复杂度
     * @param nums 数组
     * @param target 目标值
     * @return
     */
    public static int[] testTwo(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int other = target - nums[i];
            if (map.containsKey(other)){
                return new int[]{i, map.get(other)};
            }
        }

        return null;
    }

    /**
     * 第三种方法， 一次遍历数组
     * @param nums 数组
     * @param target 目标值
     * @return
     */
    public static int[] testThree(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int other = target - nums[i];
            if (map.containsKey(other)){
                return new int[]{i, map.get(other)};
            }
            map.put(nums[i], i);
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

        System.out.println("===================");

        int[] ints2 = testTwo(intArray, target);
        System.out.println("====================");
        for (int i : ints2) {
            System.out.println(i);
        }

        System.out.println("====================");

        int[] ints3 = testTwo(intArray, target);
        System.out.println("====================");
        for (int i : ints3) {
            System.out.println(i);
        }
    }
}
