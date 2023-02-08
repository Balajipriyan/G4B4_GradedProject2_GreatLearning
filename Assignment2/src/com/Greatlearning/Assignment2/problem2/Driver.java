package com.Greatlearning.Assignment2.problem2;

public class Driver {

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		int Value = 0;			
		skewedtree tree = new skewedtree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		tree.Changetoskew(tree.node, Value);
		tree.Changetorightskew(tree.headNode);
	}

}
