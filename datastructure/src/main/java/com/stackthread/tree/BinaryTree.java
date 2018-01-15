package com.stackthread.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7921906471178018713L;
	private BinaryTreeNode<T> root;

	public BinaryTree() {
		root = new BinaryTreeNode<T>();
	}

	/**
	 * 
	 * @param data
	 * @param left
	 *            node
	 * @param right
	 *            node
	 * @param parent
	 *            node
	 */
	public BinaryTree(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right, BinaryTreeNode<T> parent) {
		root = new BinaryTreeNode<T>(data, left, right, null);
	}

	public List<T> getPreOrderRecurive() {
		List<T> result = new ArrayList<T>();
		BinaryTreeUtility.getPreOrderListRecursively(this.getRoot(), result);
		return result;
	}

	public List<T> getInOrderRecurive() {
		List<T> result = new ArrayList<T>();
		BinaryTreeUtility.getInOrderListRecursively(this.getRoot(), result);
		return result;
	}

	public List<T> getPostOrderRecurive() {
		List<T> result = new ArrayList<T>();
		BinaryTreeUtility.getPostOrderListRecursively(this.getRoot(), result);
		return result;
	}

	public List<T> getPreOrder() {
		List<T> result = new ArrayList<T>();
		BinaryTreeUtility.getPreOrderList(this.getRoot(), result);
		return result;
	}

	public List<T> getInOrder() {
		List<T> result = new ArrayList<T>();
		BinaryTreeUtility.getInOrderList(this.getRoot(), result);
		return result;
	}

	public List<T> getPostOrder() {
		List<T> result = new ArrayList<T>();
		BinaryTreeUtility.getPostOrderList(this.getRoot(), result);
		return result;
	}
	// getters
	/**
	 * @return the node
	 */
	public BinaryTreeNode<T> getRoot() {
		return root;
	}

}
