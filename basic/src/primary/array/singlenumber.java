package primary.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 牧辰
 * @email AmbooChou@outlook.com
 * @date 2021/7/5 21:08
 * 学会了又赚5000
 */
public class singlenumber {
    public  static int  singleNumber(int[] nums) {
        Arrays.sort(nums);
        if ((nums.length == 1) || (nums[0] != nums[1])) {
            return nums[0];
        }
        if ((nums.length !=1) && (nums[nums.length-2] != nums[nums.length-1])){
            return nums[nums.length-1];
        }
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static int singleNumber2(int[] nums){
        int reduce =0;
        for(int num:nums){
            reduce=num ^ reduce;
        }
        return reduce;
    }

    public static int singleNumber3(int[] nums){
        Set<Integer> set=new HashSet<>();
        for (int num:nums){
            if (!set.add(num)) {
                set.remove(num);
            }
            }
        return (int) set.toArray()[0];
        }


    public  static void main(String[] arge){
        int[] nums=new int[]{3,3,4,4,6,6,8};
//        System.out.println(singleNumber(nums));
//        System.out.println(singleNumber2(nums));
        System.out.println(singleNumber3(nums));

    }

}
