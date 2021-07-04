package primary.array;

import java.util.Arrays;
import java.util.EnumSet;

/**
 * @author 牧辰
 * @email AmbooChou@outlook.com
 * @date 2021/7/4 11:25
 */
public class moochen4 {
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 0;i< nums.length;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;

    }

    public static void main(String [] arge){
        int[] nums=new int[]{1,2,2,3,4,5,6};
        if (containsDuplicate(nums)) {
            System.out.println("重复数组");
        } else{

            System.out.println("非重复数组");
        }

    }

}
