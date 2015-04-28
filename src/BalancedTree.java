

public class BalancedTree {
	static boolean isLeftBalanced= true, isRightBalanced=true, isBalanced= true;
	static BinaryTree bt= null;
	
	Node temp= null;
		
	public static void main(String a[])
	
		{ 
		 BalancedTree ib= new BalancedTree();
			bt= BinaryTree.createdummyTree();
			boolean b= ib.isBalancedTree(bt.root);
	System.out.print("is Tree balanced ? ");
	System.out.print(b);
	
		
		}
	

	private boolean isBalancedTree(Node root) {
		 temp= root;
		 
		 
		if(root == null)
			return true;
		
		Node temp = root;
		while(isBalanced)
		{
			if(temp.leftChild != null && isLeftBalanced){	
				 if(isLeftBalanced==false) 	{isBalanced=false; isRightBalanced= false;}
				isLeftBalanced  = isBalancedTree(temp.leftChild);
			 
			}
			
			if(temp.rightChild!= null && isRightBalanced){
				isRightBalanced = isBalancedTree(temp.rightChild);
				 if(isRightBalanced==false) 	{isBalanced=false; isLeftBalanced= false;}
			}
			if(isRightBalanced && isLeftBalanced){
				return isNodeBalanced(temp);		
			}
		
			
		}
		return isBalanced;
		
		
	}
	
	private boolean isNodeBalanced(Node node){
		Node left = node.leftChild;
		Node right = node.rightChild;
		if((left == null && right == null) || (left != null && right != null)){
			return true;
		}
		return false;
	}

}
