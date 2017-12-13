/**
 * 
http://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
Write a function that returns true if the given Binary Tree is SumTree else false. 
A SumTree is a Binary Tree where the value of a node is equal to sum of the nodes present 
in its left subtree and right subtree. An empty tree is SumTree and sum of an empty tree can 
be considered as 0. A leaf node is also considered as SumTree.

Following is an example of SumTree.

          26
        /   \
      10     3
    /    \     \
  4      6      3
 
 *
 */
package com.stackthread.tree;

public class SumOfTree {

	public static void main(String[] args) {
		SumOfTree ob = new SumOfTree();
		Node tree = new Node(26);
        tree.left = new Node(10);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(6);
        tree.right.right = new Node(3);
        System.out.println(ob.isSumOfTree(tree));
	}

	// returns true if all tree nodes are sum of there subtree
	protected boolean isSumOfTree(Node node){

		if(node==null || (node.left==null && node.right==null))
			return true;
		
		int leftSum=sumOfTree(node.right);
		int rightSum=sumOfTree(node.left);
		if(node.data==leftSum+rightSum)
			return isSumOfTree(node.left) && isSumOfTree(node.right);
		else
			return false;
	}
	//returns sum of sub tree
	protected int sumOfTree(Node node)
	{
		if(node==null)
			return 0;
		return node.data+sumOfTree(node.left)+sumOfTree(node.right);
	}
}

//Node definition
class Node{
	int data;
	Node left,right;
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
