package com.stackthread.amazon;

import java.util.Scanner;

public class Fixing2NodesOfBST {

	public static void main(String[] args) {
		// tree string
		// String treeStr = "10 5 L 10 8 R 5 2 L 5 20 R";
		Scanner sc = new Scanner(System.in);
		int nodeData, nodeChildData;
		boolean childFlag = true;
		BinaryTree bt = new BinaryTree();
		BinaryTree node;
		while (sc.hasNext()) {
			nodeData = sc.nextInt();
			node = findNode(bt, nodeData);
			nodeChildData = sc.nextInt();
			
			if ("L".equals(sc.next()))
				node.addLeftChild(node, nodeData);
			else
				node.addRightChild(node, nodeData);

		}
		sc.close();

	}

	private static BinaryTree findNode(BinaryTree bt, int nodeData) {
		return null;
		
	}
}

class BinaryTree {
	private int data;
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	private BinaryTree parent;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryTree getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTree leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTree getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTree rightChild) {
		this.rightChild = rightChild;
	}

	public BinaryTree getParent() {
		return parent;
	}

	public void setParent(BinaryTree parent) {
		this.parent = parent;
	}

	public void addLeftChild(BinaryTree bt, int data) {
		BinaryTree node = new BinaryTree();
		node.setData(data);
		bt.setLeftChild(node);
	}

	public void addRightChild(BinaryTree bt, int data) {
		BinaryTree node = new BinaryTree();
		node.setData(data);
		bt.setRightChild(node);
	}
}