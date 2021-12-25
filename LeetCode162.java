/**
 * @ClassName: LeetCode162
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/25 8:57
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode162 {
    public int findPeakElement(int[] nums) {
        if(nums.length==0 || nums==null){
            return -1;
        }
        int left=0;
        int right= nums.length-1;
        while (left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }
        }
        return left;
    }
}
