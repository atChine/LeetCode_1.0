/**
 * @ClassName: LeetCode704
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/24 21:06
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode704 {
    public int search(int[] nums, int target) {
        if(nums.length==0 || nums==null){
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }if(nums[mid]<target){
                left=mid+1;
            }if(nums[mid]>target){
                right=mid-1;
            }
        }
        return -1;
    }
}
