package primary.array;

import java.util.Arrays;

/**
 * @author 牧辰
 * @email AmbooChou@outlook.com
 * @date 2021/7/3 20:28
 */
public class moochen3 {

    private String[] arge;

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[end];
            nums[end--] = nums[start];
            nums[start++] = temp;

        }
    }
    public static void main(String[] arge){

        int[] nums=new int[]{1,2,3,4,5,6,7};
        System.out.println("premAraay-"+ Arrays.toString(nums));
        rotate(nums,3);
        System.out.println("rotateArray-"+Arrays.toString(nums));
    }

}
