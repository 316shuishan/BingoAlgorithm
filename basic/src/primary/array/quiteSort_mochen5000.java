package primary.array;

import java.util.Arrays;

/**
 * @author 牧辰
 * @email AmbooChou@outlook.com
 * @date 2021/7/4 21:56
 */
public class quiteSort_mochen5000 {
    public static void quickSort(int[] nums,int low,int height){
        if(low<height){
            int left=low;
            int right=height;
            int temp=nums[low];
            while(left<right){
                while(left<right && nums[right]>=temp){
                    right --;
                }
                if(left<right && nums[right]<temp){
                    nums[left]=nums[right];
                }
                while(left<right && nums[left]<=temp){
                    left ++;
                }
                if(left <right && nums[left]>temp){
                    nums[right]=nums[left];
                }
            }
            nums[left]=temp;
            quickSort(nums,low,left-1);
            quickSort(nums,left+1,height);
        }
    }
    public static void main(String[] arge){
        int[] nums=new int[]{2,1,4,3,8};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
