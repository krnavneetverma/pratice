package com.stackthread.tree;

public class BinaryTreeExecutor {

	public static void main(String[] args) {
		/***
		 * 		 10
		 * 	   5     12
		 *   3  6  11   13
		 * 2              14
		 * 
		 */
		BinaryTree<Integer> bt = new BinaryTree<Integer>(10, null, null, null);
		BinaryTreeNode<Integer> node = bt.getRoot();
		node.left=new BinaryTreeNode<Integer>(5,null,null,node);
		node.right=new BinaryTreeNode<Integer>(12,null,null,node);
		node.left.left=new BinaryTreeNode<Integer>(3,null,null,node.left);
		node.left.right=new BinaryTreeNode<Integer>(6,null,null,node.left);
		node.right.left=new BinaryTreeNode<Integer>(11,null,null,node.right);
		node.right.right=new BinaryTreeNode<Integer>(13,null,null,node.right);
		node.left.left.left=new BinaryTreeNode<Integer>(2,null,null,node.left.left);
		node.right.right.right=new BinaryTreeNode<Integer>(14,null,null,node.right.right);
		
		System.out.println("Pre Order:"+bt.getPreOrderRecurive());
		System.out.println("In Order:"+bt.getInOrderRecurive());
		System.out.println("Post Order:"+bt.getPostOrderRecurive());
		System.out.println("Pre Order:"+bt.getPreOrder());
		System.out.println("In Order:"+bt.getInOrder());
	}
}
