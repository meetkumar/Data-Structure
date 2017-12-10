//Delete a Node from Binary Search Tree

package Tree;

class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		data = d;
		left = right = null;
	}
}

public class deleteNodeBST {

	Node add(Node root, int data){
		if(root == null) {
			root = new Node(data);
		}
		else if(data > root.data){
			root.right = add(root.right,data);
		}
		else{
			root.left = add(root.left, data);
		}
		return root;
	}
	
	Node FindMin(Node root){
		while(root.left!=null) root = root.left;
		return root;
	}
	
	Node deleteBST(Node root,int value){
		if(root == null) return root;
		else if(value < root.data){
			root.left = deleteBST(root.left, value);
		}
		else if(value > root.data){
			root.right = deleteBST(root.right, value);
		}
		else{
			if(root.left==null && root.right ==null){
				//Node temp = root;
				root = null;
			}
			else if(root.left==null){
				//Node temp = root;
				root = root.right;
			}
			else if(root.right == null){
				root = root.left;
			}
			else{
				Node temp = FindMin(root.right);
				root.data = temp.data;
				root.right = deleteBST(root.right,temp.data);
			}
			
		}
		return root;
	}
	
	void Inorder(Node root){
		if(root == null) return;
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}
	
	Node Reverse(Node root){
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if(root.left!=null){
			Reverse(root.left);
		}
		if(root.right!=null)
			Reverse(root.right);
		return root;
	}
	
	public static void main(String[] args){
		Node root =null;
		deleteNodeBST s = new deleteNodeBST();
		root = s.add(root,10);
		root = s.add(root, 8);
		root = s.add(root, 12);
		root = s.add(root, 2);
		root=s.add(root, 11);
		root = s.add(root, 25);
		s.Inorder(root);
		root = s.deleteBST(root, 12) ;
		System.out.println();
		s.Inorder(root);
		s.Reverse(root);
		System.out.println();
		s.Inorder(root);
	}
	
}
