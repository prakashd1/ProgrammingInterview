package ip;

import java.util.Arrays;
import java.util.List;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class RemoveNode {
	public ListNode removeElements(ListNode head, int val) {
		ListNode fakeHead = new ListNode(-1);
		fakeHead.next = head;
		ListNode curr = head, prev = fakeHead;
		while (curr != null) {
			if (curr.val == val) {
				prev.next = curr.next;
			} else {
				prev = prev.next;
			}
			curr = curr.next;
		}

		return fakeHead.next;

	}

	public static ListNode rm(ListNode ln , int val) {
		if(ln==null) 
			return null;
		
		ln.next = rm(ln.next , val);
		return ln.val == val ? ln.next : ln;
		
	}
	public static ListNode addElementsRecursively(List<Integer> list, int idx , ListNode next) {
		if(idx >=list.size())
			return null;
		ListNode nxt = addElementsRecursively(list, idx+1, next);		
		return new ListNode(list.get(idx), nxt);		
		
	}

	public static void main(String[] args) {
		
		
		Integer []x = {1, 2, 3 , 4, 5, 6, 7, 8};
		ListNode rt=addElementsRecursively(Arrays.asList(x), 0, null);
		rt = rm(rt, 4);
		while(rt!=null) {
			System.out.println(rt.val);
			rt=rt.next;
		}

	}

}
