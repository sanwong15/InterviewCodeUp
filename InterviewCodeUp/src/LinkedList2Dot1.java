/*
 * San Wong
 */
public class LinkedList2Dot1 {

	public static void main(String[] args) {
		//Test Case 1
		Node nodeOne = new Node(1);
		Node nodeTwo = new Node(2);
		Node nodeThree = new Node(3);
		Node nodeFour = new Node(4);
		Node nodeFive = new Node(5);
		
		nodeOne.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = nodeFour;
		nodeFour.next = nodeFive;
		
		System.out.println("Test Case 1:");
		printList(nodeOne);
		OddEvenList(nodeOne);
		printList(nodeOne);
		
		//Test Case 2
		Node nodeOne1 = new Node(1);
		Node nodeTwo1 = new Node(2);
		Node nodeThree1 = new Node(3);
		Node nodeFour1 = new Node(4);
		Node nodeFive1 = new Node(5);
		Node nodeSix1 = new Node(6);
		
		nodeOne1.next = nodeTwo1;
		nodeTwo1.next = nodeThree1;
		nodeThree1.next = nodeFour1;
		nodeFour1.next = nodeFive1;
		nodeFive1.next = nodeSix1;
		
		System.out.println("Test Case 2:");
		printList(nodeOne1);
		OddEvenList(nodeOne1);
		printList(nodeOne1);

	}
	
	public static void printList(Node head){
		while (head!=null && head.next != null){
			System.out.print(head.Data + " -> ");
			head = head.next;
		}
		
		if(head.next == null){
			System.out.print(head.Data);
		}
		
		System.out.println();
	}
	
	public static int numOfNodes(Node head){
		int num = 0;
		while (head!=null && head.next != null){
			num++;
			head = head.next;
		}
		return num;
	}
	
	
	
	public static Node OddEvenList(Node head){
		if (head == null) return null;
		
		Node oddHead = head;
		Node evenHead = head.next;
		Node evenTraveller = evenHead;

		
		while(oddHead != null && oddHead.next!=null && oddHead.next.next!=null){
			oddHead.next = oddHead.next.next;
            oddHead = oddHead.next;
            evenTraveller.next = evenTraveller.next.next;
            evenTraveller = evenTraveller.next;
		}
		oddHead.next = evenHead;
		
		return head;
	}
}
