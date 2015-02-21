package BinaryTree;

public class BinaryTree {
	TreeNode root;

	
	
	public BinaryTree() {
		super();
	}

	public BinaryTree(TreeNode root) {
		super();
		this.root = root;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void insert(TreeNode node){
		if(root==null){
			root = node;
		}
		else{
			root.addNode(node);
		}
		
	}
	
	
	
	//use recursion to figure out the maximum depth of the tree
	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	
	
	//use recursion to figure out the minimum depth of the tree
	public int minDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}
	
	public void addToTreeBalance(int[] array,int start, int end){
		
		if(end <= start){
			this.insert(new TreeNode(array[end]));
		}
		else{
			int mid = (start + end)/2;
			
			this.insert(new TreeNode(array[mid]));
			
			addToTreeBalance(array, start, mid-1);
			
			addToTreeBalance(array, mid+1, end);
			
		}
		
	}
	
	
}
