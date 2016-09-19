import java.util.ArrayList;

/*
 * San Wong
 */
public class TwoDotTwo {

	public static void main(String[] args) {
		//TestCase1
		Node nodeOne = new Node(1);
		Node nodeTwo = new Node(2);
		Node nodeThree = new Node(3);
		Node nodeFour = new Node(4);
		Node nodeFive = new Node(5);
		
		nodeOne.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = nodeFour;
		nodeFour.next = nodeFive;
		nodeFive.next = nodeThree;
		
		System.out.println("Test Case 1: "+loopDetect(nodeOne));
		
		//TestCase2
		Node nodeOne1 = new Node(1);
		Node nodeTwo1 = new Node(2);
		Node nodeThree1 = new Node(3);
		Node nodeFour1 = new Node(4);
		Node nodeFive1 = new Node(5);
		
		nodeOne1.next = nodeTwo1;
		nodeTwo1.next = nodeThree1;
		nodeThree1.next = nodeFour1;
		nodeFour1.next = nodeFive1;
		System.out.println("Test Case 2: " +loopDetect(nodeOne1));
		
	}
	
	public static boolean loopDetect(Node head){
		ArrayList<Node> visited = new ArrayList<Node>();
		
		while(head!=null && head.next!=null){
			
			if(visited.contains(head)){
				//Loop detected
				return false;
			}else{
				visited.add(head); //Mark as visited
				head = head.next;
			}
		}
		//No loop detected
		return true;
	}

}
