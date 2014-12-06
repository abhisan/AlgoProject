package listandarray;
import java.util.HashMap;

public class RemoveDupsInUnSortedList {

	public static void deleteDups(LinkedListNode n) {
		HashMap table = new HashMap();
		LinkedListNode previous = null;
		while (n != null) {
			if (table.containsKey(n.data))
				previous.next = n.next;
			else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}
	public static void main(String s[]){
		
		LinkedListNode lln0 = new LinkedListNode();
		LinkedListNode lln1 = new LinkedListNode();
		LinkedListNode lln2 = new LinkedListNode();
		LinkedListNode lln3 = new LinkedListNode();
		LinkedListNode lln4 = new LinkedListNode();
		
		lln0.data = 0;
		lln0.next = lln1;
		
		lln1.data = 1;
		lln1.next = lln2;
		
		lln2.data = 2;
		lln2.next = lln3;
		
		lln3.data = 3;
		lln3.next = lln4;
		
		lln4.data = 0;
		lln4.next = null;
		
		RemoveDupsInUnSortedList rd = new RemoveDupsInUnSortedList();
		System.out.println(lln0);
		rd.deleteDups(lln0);
		System.out.println(lln0);
	}
}

class LinkedListNode{
	public int data;
	public LinkedListNode next;
}