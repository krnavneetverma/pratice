package com.stackthread.tree;

public class BinaryTreeNode<T> {
	
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	public BinaryTreeNode<T> parent;
	
	public BinaryTreeNode() {
		this.data = null;
		this.left = null;
		this.right = null;
		this.parent = null;
	}

	public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right, BinaryTreeNode<T> parent) {
		this.data = data;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}

	@Override
	public String toString() {
		return  data + "";
	}
	
	
	

}