package listandarray;


public class RemoveDupsInUnSortedList1 {
	public static void deleteDups(LinkedListNode n) {
		LinkedListNode runningNode;
		LinkedListNode searchNode;
		LinkedListNode prevNode;
		searchNode = n;
		prevNode = n;
		
		runningNode = n.next;
		while(searchNode!=null){
			while(runningNode!=null){
				if(runningNode.data == searchNode.data){
					prevNode.next = runningNode;
				}
			}
			searchNode = searchNode.next;
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
		
		lln2.data = 0;
		lln2.next = lln3;
		
		lln3.data = 0;
		lln3.next = lln4;
		
		lln4.data = 4;
		lln4.next = null;
		
		System.out.println(lln0);
		RemoveDupsInUnSortedList.deleteDups(lln0);
		System.out.println(lln0);
	}
}
