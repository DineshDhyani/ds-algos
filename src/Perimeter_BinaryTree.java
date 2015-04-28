
public class Perimeter_BinaryTree {
	//Node temp;
	static BinaryTree bt= null;
	public static void main(String a[])
	{  
		bt= BinaryTree.createdummyTree();
		bt.inorderTraversal(bt.root);
		System.out.println("Perimeter is :");
		Perimeter_BinaryTree p= new Perimeter_BinaryTree();
		p.perimeterLeft(bt.root);
		p.perimeterRight(bt.root);
	}

	public void perimeterLeft(Node root) {
		Node temp = root;
	if (temp.leftChild != null)
			{perimeterLeft(temp.leftChild);	
			}
	System.out.print(temp.data);
	
	
	}
	
	public void perimeterRight(Node root) {
		Node temp = root;
		
			if (temp.rightChild != null){
				System.out.print(temp.rightChild.data);
				perimeterRight(temp.rightChild);
				}
				
	}

	}
	
	




