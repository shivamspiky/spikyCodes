
public class PartitionInLinkedList {

	
	/*We can use this algorithm to apply quicksort on linkedlist*/
	public void partition(LinkedNode head, int n) {
		if(head == null || head.getNext() == null) {
			return ;
		}
		
		LinkedNode temp = head;
		LinkedNode firstLargeNumber=null;
		
		while(temp!=null){
			
			if(temp.getData() >= n) {
				if(firstLargeNumber==null) {
					firstLargeNumber = temp;
				}
				
			} else {
				if(firstLargeNumber!=null) {
					int tempData = firstLargeNumber.getData();
					firstLargeNumber.setData(temp.getData());
					temp.setData(tempData);
					firstLargeNumber = firstLargeNumber.getNext();
				}
			}
			temp = temp.getNext();
			
		}
	}
	
	public static void main(String[] args) {
		LinkedNode head = new LinkedNode(3);
		LinkedNode node1 = new LinkedNode(5);
		LinkedNode node2 = new LinkedNode(8);
		LinkedNode node3 = new LinkedNode(5);
		LinkedNode node4 = new LinkedNode(10);
		LinkedNode node5 = new LinkedNode(2);
		LinkedNode node6 = new LinkedNode(1);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		
		PartitionInLinkedList partitionLinkedList = new PartitionInLinkedList();
		partitionLinkedList.partition(head, 5);
		LinkedNode temp = head;
		while(temp!=null) {
			System.out.print(temp.getData() + "\t");
			temp=temp.getNext();
		}
		
		
		
	}
}
