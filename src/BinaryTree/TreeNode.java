package BinaryTree;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;
	
	
	
	public TreeNode() {
		super();
	}

	public TreeNode(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public TreeNode(TreeNode left, TreeNode right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public void addNode(TreeNode node){
		if(node.data<this.data){
			if(this.left==null){
				this.left = node;
			}
			else{
				this.left.addNode(node);
			}
		}
		else{
			if(this.right==null){
				this.right=node;
			}
			else{
				this.right.addNode(node);
			}
		}
	}
	
	
}
