package Exercise1113;

import java.util.HashSet;

public class LeetCode217 {
	public boolean containsDuplicate(int[] nums) {
		if (nums.length == 0 || nums == null) {
			return false;
		}
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num : nums) {
			hashSet.add(num);
		}
		return nums.length == hashSet.size() ? false : true;
	}
}
