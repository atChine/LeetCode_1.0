import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @ClassName: LeetCode215
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/23 21:21
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null || nums.length<k ||k==0 ){
            return Integer.MIN_VALUE;
        }
        PriorityQueue<Integer> max_Queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            max_Queue.add(num);
           }
        while (k>1){
            max_Queue.poll();
            k--;
        }
        return max_Queue.poll();
    }
}
