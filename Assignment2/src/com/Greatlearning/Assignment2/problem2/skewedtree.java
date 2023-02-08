package com.Greatlearning.Assignment2.problem2;

class Node
{
	int Num;
	public Node left;
	public Node right;

	public Node(int item)
	{
		Num = item;
		left = right = null;
	}
}
public class skewedtree
{
	public static Node node;
	static Node FirstNode = null;
	static Node headNode = null;

	static void Changetoskew(Node root,int Value)                              
	{

		if(root == null)
		{
			return;
		}

		if(Value > 0)
		{
			Changetoskew(root.right, Value);
		}
		else
		{
			Changetoskew(root.left, Value);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			FirstNode = root;
		}
		else
		{
			FirstNode.right = root;
			root.left = null;
			FirstNode = root;
		}

		if (Value > 0)
		{
			Changetoskew(leftNode, Value);
		}
		else
		{
			Changetoskew(rightNode, Value);
		}
	}

	static void Changetorightskew(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.Num + " ");
		Changetorightskew(root.right);       
	}	
}
