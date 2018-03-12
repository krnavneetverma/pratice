package com.stackthreads.gfg;

import java.util.PriorityQueue;
import java.util.Queue;

public class KnightWalk {

	public static void main(String[] args) {
		int sx = 4, sy = 5;
		int dx = 1, dy = 1;
		int boardSize = 6;
		System.out.println(minStepToReach(sx, sy, dx, dy, boardSize));
	}

	private static int minStepToReach(int sx, int sy, int dx, int dy, int boardSize) {
		int minSteps = -1;
		// queue, to traverse path in BFS
		Queue<Position> queue = new PriorityQueue<Position>();
		queue.add(new Position(sx, sy));
		// visitedPos
		Node [][] visited = new Node[boardSize][boardSize];
		// while queue not empty
		
		return minSteps;
	}
}
class Position{
	private int x;
	private int y;
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
class Node {
	private Position pos;
	private int parent;
	private int count;

	public Node(Position pos, int parent, int count) {
		super();
		this.pos = pos;
		this.parent = parent;
		this.count = count;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getParent() {
		return parent;
	}

	public int getCount() {
		return count;
	}
}
