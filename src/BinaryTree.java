public class BinaryTree {

	Node root;
	
	void addNode(int x) {
		Node newNode = new Node(x);
		if (root == null) {
			root = newNode;
		}
		else {
			Node focusNode = root;
			Node parent;

			while (true)
			{
				parent = focusNode;
				if (x < focusNode.data) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				}else if (x > focusNode.data) {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		BinaryTree bt = createdummyTree();

		bt.inorderTraversal(bt.root);
	}

	public static BinaryTree createdummyTree() {
		BinaryTree bt = new BinaryTree();
		bt.addNode(7);
		bt.addNode(5);
		bt.addNode(9);
		bt.addNode(4);
		bt.addNode(6);
		bt.addNode(8);
		//bt.addNode(10);
		return bt;
	}

	void inorderTraversal(Node root) {
		final Node temp = root;

		if (temp!=(null)) {
			inorderTraversal(temp.leftChild);
			System.out.println(temp.data);
			inorderTraversal(temp.rightChild);
			
			
		} 
	}
}

class Node {
	int data;
	Node leftChild;
	Node rightChild;

	Node(int x) {
		this.data = x;
	}
}
