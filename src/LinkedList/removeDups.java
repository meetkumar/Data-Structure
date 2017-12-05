//Remove duplicate from Unsorted Linked List

package LinkedList;

import java.util.HashSet;

public class removeDups {
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
	
	public void removeDup(Node head){
		HashSet<Integer> hS = new HashSet<>();
		Node current = head;
		Node prev=null;
		while(current!=null){
			if(hS.contains(current.data)){
				prev.next = current.next;
				//free(current);
			}
			else{
				hS.add(current.data);
				prev=current;
			}
			current = prev.next;
		}
	}
	
	public static void main(String[] args){
		Node head = null;
		removeDups r = new removeDups();
		head = r.add(head, 5);
		head = r.add(head, 10);
		head = r.add(head,15);
		head = r.add(head, 5);
		head = r.add(head, 7);
		//removeDups r =new removeDups();
		r.removeDup(head);
		while(head!=null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
