package com.am.mission.interview;

import com.am.mission.interview.HeightOfBinaryTree.Tree;

public class TwoMirrorTree {

	static class Tree {
		int data;
		Tree left, right;

		public Tree(int data) {
			this.data = data;
			left = right = null;
		}

		public Tree(Tree tree) {
			if (tree != null)
				this.data = tree.data;
			left = right = null;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}
	}

	public static void main(String[] args) {
		Tree root = new TwoMirrorTree.Tree(1);
		root.left = new TwoMirrorTree.Tree(2);
		root.right = new TwoMirrorTree.Tree(3);
		root.left.left = new TwoMirrorTree.Tree(4);
		root.left.right = new TwoMirrorTree.Tree(5);

		Tree mirror = new TwoMirrorTree.Tree(1);
		mirror.left = new TwoMirrorTree.Tree(3);
		mirror.right = new TwoMirrorTree.Tree(2);
		mirror.right.left = new TwoMirrorTree.Tree(5);
		mirror.right.right = new TwoMirrorTree.Tree(4);

		System.out.println(isTreesMirror(root, mirror));
		System.out.println(createMirrorTree(root, null));
	}

	private static boolean isTreesMirror(Tree root, Tree mirror) {

		if (root == null && mirror == null)
			return true;

		if (isTreesMirror(root.left, mirror.right) && isTreesMirror(root.right, mirror.left)
				&& root.data == mirror.data)
			return true;
		else
			return false;
	}

	private static Tree createMirrorTree(Tree root, Tree mirror) {

		if (mirror == null)
			mirror = new TwoMirrorTree.Tree(root.data);

		mirror.left =  (root.right!=null)?new TwoMirrorTree.Tree( root.right.data):null;
		mirror.right =  (root.left!=null)?new TwoMirrorTree.Tree(root.left.data):null;
		if (root.left != null)
			createMirrorTree(root.left, mirror.right);
		if (root.right != null)
			createMirrorTree(root.right, mirror.left);
		return mirror;
	}
}
