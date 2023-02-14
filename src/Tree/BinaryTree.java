package Tree;

import java.util.Stack;

public class BinaryTree {
	
	TreeNode root;
	
	public class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
		
	}
	
	public void run() {
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		
		root = one;
		root.left = two;
		root.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
	}
	
	public void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void InOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	
	public void preOrderIterative(TreeNode root) {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right != null)
				stack.push(temp.right);
			if(temp.left != null)
				stack.push(temp.left);
		}
	}
	
	public static void main(String args[]) {
		BinaryTree obj = new BinaryTree();
		obj.run();
		obj.InOrder(obj.root);
	}
}
