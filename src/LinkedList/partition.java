/*Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.
EXAMPLE
Input: 3 -> 5 -> 8 -> 5 -> 113 -> 2 -> 1 [partition = 5]
Output: 3 -> 1 -> 2 -> 113 -> 5 -> 5 -> 8 
*/
package LinkedList;

public class partition {
	public class Node{
		int data;
		Node next;
	}
	
	Node add(Node head, int data){
		Node temp = new Node();
		temp.data = data;
		temp.next = head;
		head = temp;
		return head;
	}
	
	private Node partitioner(Node node, int partition){
		Node head = node;
		Node tail = node;
		while(node!=null){
			Node Next = node.next;
			if(node.data < partition){
				node.next = head;
				head = node;
			}
			else{
				tail.next = node;
				tail = node;
			}
			node = Next;
		}
		tail.next = null;
		return head;
	}
	
	public static void main(String[] args){
		Node head = null;
		partition p = new partition();
		head = p.add(head, 5);
		head = p.add(head, 7);
		head = p.add(head, 12);
		head = p.add(head, 3);
		head = p.add(head, 113);
		head = p.add(head, 2);
		head = p.add(head, 4);
		head=p.add(head, 35);
		head = p.partitioner (head, 5);
		System.out.print("List is : ");
		while(head!=null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
}
