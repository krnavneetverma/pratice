package com.stackthread.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeUtility {

	// Recursive traversal
	// pre order traversal is same as DFS
	/**
	 * Pre Order
	 * 
	 * @param node
	 * @param result
	 */
	public static void getPreOrderListRecursively(BinaryTreeNode node, List result) {
		if (result == null) {
			result = new ArrayList();
		}
		if (node == null) {
			return;
		}
		result.add(node);
		getPreOrderListRecursively(node.left, result);
		getPreOrderListRecursively(node.right, result);
	}

	/**
	 * In Order
	 * 
	 * @param node
	 * @param result
	 */
	public static void getInOrderListRecursively(BinaryTreeNode node, List result) {
		if (result == null) {
			result = new ArrayList();
		}
		if (node == null) {
			return;
		}
		getInOrderListRecursively(node.left, result);
		result.add(node);
		getInOrderListRecursively(node.right, result);
	}

	/**
	 * Post Order
	 * 
	 * @param node
	 * @param result
	 */
	public static void getPostOrderListRecursively(BinaryTreeNode node, List result) {
		if (result == null) {
			result = new ArrayList();
		}
		if (node == null) {
			return;
		}
		getPostOrderListRecursively(node.left, result);
		getPostOrderListRecursively(node.right, result);
		result.add(node);
	}

	/**
	 * TODO: traversal using Stacks: pre, in, post order
	 */
	public static void getPreOrderList(BinaryTreeNode root, List result) {
		if (result == null) {
			result = new ArrayList();
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();

		while (!stack.isEmpty() || root != null) {

			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			result.add(root);
			while (root.right == null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			result.add(root);
			if (root != null) {
				root = root.right;
				stack.push(root);
			}
			
		}
	}

	/***
	 * 10 5 12 3 6 11 13 2 14
	 * 
	 */
	public static void getInOrderList(BinaryTreeNode root, List result) {
		if (result == null) {
			result = new ArrayList();
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();

		do {
			if (root != null && null != root.right)
				stack.push(root.right);
			stack.push(root);
			if (null != root.left)
				stack.push(root.left);
			if (root != null) {
				root = root.left;
			} else {
				root = stack.pop();
				result.add(root);
			}
		} while (root != null && !stack.isEmpty());
	}

	public static void getPostOrderList(BinaryTreeNode root, List result) {
		// TODO Auto-generated method stub
	}

	/**
	 * TODO: post order traversal using one stacks
	 */
	public static void getPostOrderListUsingOneStack(BinaryTreeNode root, List result) {
		// TODO Auto-generated method stub
	}

	/**
	 * TODO: BFS: Using Queue
	 * 
	 * @param node
	 * @return
	 */
	public static List getBFSList(BinaryTreeNode node) {
		return null;
	}

	/**
	 * TODO : serialize binary tree
	 */
	public static void serialize(BinaryTreeNode node) {

	}

	/**
	 * TODO : deserialize binary tree
	 */
	public static void deserialize(BinaryTreeNode node) {

	}

	/**
	 * display binary tree
	 * 
	 * @param tree
	 */
	public static void displayBinaryTree(BinaryTree tree) {

	}

}
