import java.util.HashSet;

/**
 * @ClassName: LeetCode217
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/22 20:40
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0 || nums==null){
            return false;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        return (hashSet.size()== nums.length?false:true);
    }
}
