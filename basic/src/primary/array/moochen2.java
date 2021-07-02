package primary.array;

/**
 * @author 牧辰
 * @email AmbooChou@outlook.com
 * @date 2021/7/2 20:10
 */
public class moochen2 {
    public static int maxProfit(int[] prices) {
        int count = 0;
        int diff=0;
        for(int i =0;i<prices.length-1;i++){
            diff=prices[i+1]-prices[i];
            if (diff>0){
                count = count + diff;
            }
            count=count+0;
        }
        return count;
    }

    public static void main(String[] args){
        int [] nums = new int[]{7,1,5,3,6,4};
        int count=maxProfit(nums);
        System.out.println(count);

    }

}
