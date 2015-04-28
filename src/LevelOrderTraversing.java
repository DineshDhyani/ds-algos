import java.util.*;

public class LevelOrderTraversing {

public static void main(String a[])
{
	BinaryTree bt=BinaryTree.createdummyTree();
	new LevelOrderTraversing().leverOrder(bt.root);
}

public void leverOrder(Node root)
{
Queue<Node> q = new LinkedList<Node>();

if(root !=null){q.add(root);}
while(!q.isEmpty())
{
Node n= q.remove();
System.out.println(n.data);

if(n.leftChild!=null) q.add(n.leftChild);
if(n.rightChild!=null) q.add(n.rightChild);
	
	
}

}

}
