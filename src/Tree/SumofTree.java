package Tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class SumofTree {
	
	public class Node{
		int data;
		Node left;
		Node right;
	}
	
	Node getNode(Node root, int data){
		Node temp = new Node();
		temp.data = data;
		temp.left = temp.right = null;
		return temp;
	}
	
	Node add(Node root, int data){
		if(root == null) {
			root = getNode(root, data);
		}
		else if(data > root.data){
			root.right = add(root.right,data);
		}
		else{
			root.left = add(root.left, data);
		}
		return root;
	}
	
	public int Sum(Node root){
		int sum =0;
		Queue<Node> q = new LinkedBlockingQueue<>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp = q.peek();
			sum += temp.data;
			if(temp.left!=null) q.add(temp.left);
			if(temp.right!=null) q.add(temp.right);
			q.poll();
		}
		return sum;
	}
	
	public int RecursiveSum(Node root){
		if(root == null) return 0;
		return (root.data + RecursiveSum(root.left) + RecursiveSum(root.right));
	}
	
	public static void main(String[] args){
		Node root =null;
		SumofTree s = new SumofTree();
		root = s.add(root,10);
		root = s.add(root, 8);
		root = s.add(root, 12);
		root = s.add(root, 2);
		root=s.add(root, 11);
		root = s.add(root, 25);
		int answer = s.Sum(root);
		System.out.println("Total Sum of the tree is :"+answer);
		System.out.println("Recursive Sum is :"+s.RecursiveSum(root));
	}
}
