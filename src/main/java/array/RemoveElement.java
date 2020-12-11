package array;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 给定 nums = [3,2,2,3], val = 3,
 * <p>
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * <p>
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * <p>
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * <p>
 * 注意这五个元素可为任意顺序。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {


    public static int testOne(int[] nums, int target) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{2, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int num = testOne(nums, 2);
        System.out.println("====================" + num);
        for (int i : nums) {
            System.out.println(i);
        }

    }
}
