import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName: LeetCode496
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/28 21:04
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:nums2){
            while (!stack.isEmpty() && num>stack.peek()){
                int temp = stack.pop();
                map.put(temp,num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
