package primary.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 牧辰
 * @email AmbooChou@outlook.com
 * @date 2021/7/4 16:40
 */
public class moochen5 {

    public static void quickSort(int[] nums, int low, int high) {
        System.out.println("初始数组"+Arrays.toString(nums));
        if (low < high) {
            System.out.println("low="+low);
            System.out.println("hight="+high);
            int left = low;
            int right = high;
            int temp = nums[low];
            System.out.println("nums[low]="+nums[low]);
            System.out.println("right="+right);
            while (left < right) {
                System.out.println("zhaoss,left="+left+"right"+right);
                while (left < right && nums[right] >= temp) {
                    right--;
                    System.out.println("右指针移动");
                }
                if (left < right && nums[right] < temp) {
                    nums[left] = nums[right];
                    System.out.println("右边赋值左边");
                }
                while (left < right && nums[left] <= temp) {
                    left++;
                    System.out.println("左指针移动");
                }
                if (left < right && nums[left] > temp) {
                    nums[right] = nums[left];
                    System.out.println("左边赋值给右边");
                }
            }
                System.out.println("left=right="+left);
                nums[left] = temp;
                System.out.println("第一次循环完"+ Arrays.toString(nums));
                quickSort(nums, low, left - 1);
//                quickSort(nums, left + 1, high);
            }
    }

    public static void main(String[] arge) {
        int[] nums = new int[]{4, 3, 1,2,2,4,5,3};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort2(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int nextIndexer = low + 1;
        int basicIndexer = low;
        while (nextIndexer <= high) {
            if (nums[nextIndexer] <= nums[low]) {
                swap(nums, basicIndexer + 1, nextIndexer);
                basicIndexer++;
            }
            nextIndexer++;
        }
        swap(nums, low, basicIndexer);
        quickSort(nums, low, basicIndexer - 1);
        quickSort(nums, basicIndexer + 1, high);

    }

    public static void quickSort3(int[] nums, int left, int right){
        if (left >= right) {
            return;
        }
        int nextPointer = left +1;
        int rightPointer = right;
        while (nextPointer <= rightPointer){
            if(nums[nextPointer] > nums[left]){
                swap(nums, nextPointer, rightPointer);
                rightPointer--;
            }else {
                nextPointer++;
            }
        }
        nextPointer--;
        swap(nums, left, nextPointer);
        quickSort(nums, left, nextPointer - 1);
        quickSort(nums,nextPointer+1, right);
    }

    private static void swap(int[] nums, int low, int basicIndexer) {
        if (low == basicIndexer) {
            return;
        }
        int temp = nums[low];
        nums[low] = nums[basicIndexer];
        nums[basicIndexer] = temp;
    }
/**
    Set<Integer> arraySet = new HashSet<>();
    for(int i = 0; i<nums.length; i++){
        arraySet.add(nums[i]);
    }
        return arraySet.size() != nums.length;
 */
}
