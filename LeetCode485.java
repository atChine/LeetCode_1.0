package Exercise1104;

public class LeetCode485 {
	public int main(int arr[]) {
		int n = arr.length;
		if (n == 0 || arr == null) {
			return 0;
		} else {
			int count = 0;
			int result = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] == 1) {
					count++;
				} else {
					result = Math.max(result, count);
					count = 0;
				}
			}
			return Math.max(result, count);
		}
	}
}
