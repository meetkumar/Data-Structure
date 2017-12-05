//Implement an algorithm to find the kth to last element of a singly linked list.

package LinkedList;

public class returnKthlastNode {
	public class Node{
		int data;
		Node next;
	};
	
	Node add(Node head, int data){
		Node temp = new Node();
		temp.data = data;
		temp.next = head;
		head = temp;
		return head;
	}
	
	@SuppressWarnings("null")
	int kthlast(Node head, int k){
		Node slow = head;
		Node fast = head;
		for(int i=0;i<k;i++){
			if(fast==null && fast.next == null) throw new IllegalArgumentException("Not valid List");
			fast = fast.next;
		}
		while(fast!=null){
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}
	
	public static void main(String[] args){
		Node head = null;
		returnKthlastNode r = new returnKthlastNode();
		head = r.add(head, 5);
		head = r.add(head,10);
		head = r.add(head, 12);
		head = r.add(head, 6);
		int answer = r.kthlast(head,2);
		System.out.println("Kth Last Element is :"+answer);
	}
	
}
