package array;

/**
 * 删除排序数组种的重复项
 * <p>
 * 给定一个排序的数组，你需要在原地删除重复的出现的元素，使得每个元素只出现一次。
 * 返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须要在原地修改输入数组并在O(1)额外的空间条件下完成。
 * <p>
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * @Date 2020-12-11
 * @Auth zhangkun
 */
public class RemoveDuplicates {

    /**
     * 方法：双指针法
     * 数组完成排序后，我们可以放置两个指针 i和 j，其中 i 是慢指针，而 j 是快指针。
     * 只要 nums[i] = nums[j]，我们就增加 j 以跳过重复项。
     *
     * 当我们遇到 nums[j] != nums[i]nums时，跳过重复项的运行已经结束，
     * 因此我们必须把它（nums[j]nums[j]）的值复制到 nums[i + 1]nums[i+1]。
     * 然后递增 i，接着我们将再次重复相同的过程，直到 j到达数组的末尾为止。
     *
     * @param nums 有序数组
     * @return
     */
    public static int testOne(int[] nums) {

        int i = 0;
        for (int j = 1 ; j < nums.length; j++){
            if (nums[j] != nums[i]){
                i ++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int num = testOne(nums);
        System.out.println("====================" + num);
        for (int i : nums) {
            System.out.println(i);
        }

    }

}
