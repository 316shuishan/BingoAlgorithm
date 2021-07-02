package primary.array;

import java.util.Arrays;

import static primary.array.RepeatedArray.removeDuplicated;

/**
 * @author 牧辰
 * @email AmbooChou@outlook.com
 * @date 2021/7/2 15:08
 */
public class moochen {
    public int removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int i=0;
        for (int j=1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                continue;
            }
            i++;
            nums[i] = nums[j];
        }
        return i +1;
    }

    public static void main(String[] args) {
        int[] testNums1 = new int[]{1,2,3,3,4};
        int testLength= removeDuplicated(testNums1);
        System.out.println(testLength);
    }
}
