package EXercise1107;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode993 {
	Queue<Integer> queue;

	public LeetCode993() {
		queue = new LinkedList<>();
	}

	public int ping(int t) {
		queue.add(t);
		while (!queue.isEmpty() && t - queue.peek() > 3000) {
			queue.poll();
		}
		return queue.size();
	}

}
