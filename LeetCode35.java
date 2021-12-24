/**
 * @ClassName: LeetCode35
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/24 21:38
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }if(nums[mid]>target){
                right=mid;
            }if(nums[mid]<target){
                left=mid+1;
            }
        }
        return nums[left]<target? left+1 :left;
    }
}
