package BinaryTree;

public class Main {
	public static void main(String [] args){
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		
		BinaryTree bt = new BinaryTree();
		
		bt.insert(node5);
		bt.insert(node2);
		bt.insert(node1);
		bt.insert(node3);
		bt.insert(node4);
		bt.insert(node7);
		bt.insert(node6);
		bt.insert(node8);
		bt.insert(node9);
		
		System.out.println(bt.getRoot().getData());
		
		System.out.println(bt.getRoot().getLeft().getData());
		
		System.out.println(bt.getRoot().getRight().getData());
		
		System.out.println(bt.getRoot().getLeft().getLeft().getData());
		
		System.out.println(bt.getRoot().getLeft().getRight().getData());
		
		System.out.println(bt.getRoot().getRight().getLeft().getData());
		
		System.out.println(bt.getRoot().getRight().getRight().getData());
		
		System.out.println(bt.getRoot().getLeft().getRight().getRight().getData());
		
		System.out.println(bt.getRoot().getRight().getRight().getRight().getData());
		
		int maxDepth = bt.maxDepth(bt.root);
		
		int minDepth = bt.minDepth(bt.root);
		
		System.out.println("max="+maxDepth+" "+"min="+minDepth);
		
		System.out.println("**************");
		
		int [] array = {11,12,13,14,15,16,17,18,19};
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		BinaryTree bt2 = new BinaryTree();
		
		bt2.addToTreeBalance(array, 0, 8);
		
		System.out.println("**************");
		
		
		System.out.println(bt2.getRoot().getData());
		
		System.out.println(bt2.getRoot().getLeft().getData());
		
		System.out.println(bt2.getRoot().getRight().getData());
		
		System.out.println(bt2.getRoot().getLeft().getLeft().getData());
		
		System.out.println(bt2.getRoot().getLeft().getRight().getData());
		
		System.out.println(bt2.getRoot().getRight().getLeft().getData());
		
		System.out.println(bt2.getRoot().getRight().getRight().getData());
		
		System.out.println(bt2.getRoot().getLeft().getRight().getRight().getData());
		
		System.out.println(bt2.getRoot().getRight().getRight().getRight().getData());
		
		System.out.println("**************");
		
		
		
		
		
		
		
	}
}
