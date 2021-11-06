package Exercise1106;

public class LeetCode206 {
	public ListNode reverseList(ListNode head) {
		ListNode dummyHead=new ListNode(0);
		dummyHead.next=head;
		if()
		while(head!=null&&head.next!=null) {
			ListNode dnext=dummyHead.next;
			ListNode hnext=head.next;
			dummyHead.next=hnext;
			head.next=hnext.next;
			hnext.next=dnext;
		}
		return dummyHead.next;
	}
}
