/**
 * @ClassName: LeetCode141
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/24 19:08
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
