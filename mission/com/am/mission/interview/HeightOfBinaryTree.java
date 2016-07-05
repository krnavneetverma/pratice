package com.am.mission.interview;

public class HeightOfBinaryTree {

	static class Tree
	{
		int data;
		Tree left,right;
		public Tree(int data)
		{
			this.data=data;
			left=right=null;
		}
		
		@Override
		public String toString() {
			return String.valueOf(data);
		}
	}
	
	public static void main(String[] args) {
		Tree root = new HeightOfBinaryTree.Tree(1);
		root.left = new HeightOfBinaryTree.Tree(10);
		root.right = new HeightOfBinaryTree.Tree(39);
		root.left.left = new HeightOfBinaryTree.Tree(5);
		System.out.println(getTreeHeight(root));
	}

	public static int getTreeHeight(Tree root) {
		if(root==null)
			return 0;
		int height = Math.max(getTreeHeight(root.left), getTreeHeight(root.right))+1; 
		return height;
	}
}

