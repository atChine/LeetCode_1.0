
public class LeetCode209 {
	public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0 || nums==null){
        	return 0;
        }
        int i=0;
        int j=0;
        int result=nums.length+1;
        int sum=0;
        while(j<nums.length){
        	sum=sum+nums[j];
        	j++;
        	while(sum>=target){
        		result=Math.min(j-i, result);
        		sum=sum-nums[i];
        		i++;
        	}
        }
        return result==nums.length+1? 0:result;
    }
}
