package LinkedList;

import java.util.Stack;

public class reverseLinkedList {
	Stack<Node> s;
	class Node{
		int data;
		Node next;
	}
	
	Node Reverse(Node root){
		
		Node temp = root;
		while(temp!=null){
			s.push(temp);
			temp = temp.next;
		}
		
		temp = s.peek();
		root=temp;
		s.pop();
		while(!s.empty()){
			temp.next = s.peek();
			s.pop();
			temp = temp.next;
		}
		temp.next = null;
		return root;
	}
	
	Node add(Node head,int data){
		Node temp = new Node();
		temp.data = data;
		temp.next = head;
		head = temp;
		return head;
	}
	
	public static void main(String[] args){
		Node head = null;
		reverseLinkedList r = new reverseLinkedList();
		head = r.add(head, 10);
		head = r.add(head,5);
		head = r.add(head, 15);
		head = r.add(head, 1);
		r.Reverse(head);
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
		
	}
	
}
