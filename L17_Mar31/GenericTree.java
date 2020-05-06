package L17_Mar31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> child = new ArrayList<>();
	}

	private Node root;
	private int size;

	public GenericTree() {
		this.root = construct(new Scanner(System.in), null, -1);
	}

	private Node construct(Scanner scn, Node parent, int ith) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			System.out.println("Enter the data for " + ith + " th child of " + parent.data);
		}

		int val = scn.nextInt();
		Node nn = new Node();
		this.size++;
		nn.data = val;

		System.out.println("No. of children for " + nn.data);
		int noc = scn.nextInt();

		for (int i = 0; i < noc; i++) {
			Node child = construct(scn, nn, i);
			nn.child.add(child);
		}

		return nn;

	}

	public void display() {
		System.out.println("-------------------");
		display(this.root);
		System.out.println("-------------------");
	}

	private void display(Node node) {

		// self work
		String str = node.data + " -> ";

		for (int i = 0; i < node.child.size(); i++) {
			str += node.child.get(i).data + ", ";
		}

		str += ".";
		System.out.println(str);

		// smaller trees
		for (int i = 0; i < node.child.size(); i++) {
			display(node.child.get(i));
		}

	}

	public int size() {
		return this.size;
	}

	public int size2() {

		return size2(this.root);
	}

	private int size2(Node node) {
		int tcs = 0;
		for (Node n : node.child) {
			tcs += size2(n);
		}
		return tcs + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		int q = 0;
		int max = node.data;
		for (Node n : node.child) {

			q = max(n);
			if (q > max) {
				max = q;
			}
		}
		return max;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node.data == item) {
			return true;
		}
		for (Node n : node.child) {
			boolean check = find(n, item);
			if (check) {
				return true;
			}
		}
		return false;

	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		int z = -1;
		for (Node n : node.child) {
			int ch = height(n);
			if (ch > z) {
				z = ch;
			}
		}
		return z + 1;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {
		for (Node n : node.child) {
			mirror(n);
		}
		int left = 0;
		int right = node.child.size() - 1;
		while (left < right) {
			Node rn = node.child.get(left);
			Node ln = node.child.get(right);
			node.child.set(left, ln);
			node.child.set(right, rn);
			left++;
			right--;
		}
	}

	public boolean StructurallySimilar(GenericTree gt2) {
		return StructurallySimilar(this.root, gt2.root);
	}

	private boolean StructurallySimilar(Node tnode, Node onode) {
		if (tnode.child.size() != onode.child.size()) {
			return false;
		}
		for (int i = 0; i < tnode.child.size(); i++) {
			boolean c = StructurallySimilar(tnode.child.get(i), onode.child.get(i));
			if (c == false) {
				return false;
			}
		}
		return true;
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {

		System.out.println(node.data);

		for (Node n : node.child) {
			preorder(n);
		}
	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		for (Node n : node.child) {
			postorder(n);
		}
		System.out.println(node.data);
	}

	public void LevelOrder() {
		LevelOrder(this.root);
	}

	private void LevelOrder(Node node) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.println(rn.data);
			for (int i = 0; i < rn.child.size(); i++) {
				queue.addLast(rn.child.get(i));
			}
		}

	}

	public void LevelOrderLW() {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		queue.addLast(this.root);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			for (int i = 0; i < rn.child.size(); i++) {
				helper.addLast(rn.child.get(i));
			}
			if (queue.isEmpty()) {
				System.out.println();
				queue = helper;
				helper = new LinkedList<>();
			}
		}

	}

	public void LevelOrderZZ() {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> stack = new LinkedList<>();
		queue.addLast(this.root);
		int count = 0;
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			if (count % 2 == 0) {
				for (int i = 0; i < rn.child.size(); i++) {
					stack.addFirst(rn.child.get(i));
				}
			} else {
				for (int i = rn.child.size() - 1; i >= 0; i--) {
					stack.addFirst(rn.child.get(i));
				}
			}
			if (queue.isEmpty()) {
				System.out.println();
				count++;
				queue = stack;
				stack = new LinkedList<>();
			}
		}
	}

	private class HeapMover {
		int size;
		int max = Integer.MIN_VALUE;
		boolean find;
		int ht;
		Node pred;
		Node succ;
		Node jl;

	}

	public void Multisolver(int item) {
		HeapMover mover = new HeapMover();
		Multimover(root, item, 0, mover);

		System.out.println("Max :" + mover.max);
		System.out.println("Size :" + mover.size);
		System.out.println("Find " + mover.find);
		System.out.println("Height " + mover.ht);
		System.out.println("Predecessor " + (mover.pred == null ? "null" : mover.pred.data));
		System.out.println("Successor " + (mover.succ == null ? "null" : mover.succ.data));
		System.out.println("Just Larger " + (mover.jl.data));

	}

	private void Multimover(Node node, int item, int depth, HeapMover mover) {
		mover.size++;

		if (node.data > mover.max) {
			mover.max = node.data;
		}
		if (node.data > item) {
			if (mover.jl == null) {
				mover.jl = node;
			} else if (node.data < mover.jl.data) {
				mover.jl = node;
			}
		}
		// successor
		if (mover.find == true && mover.succ == null) {
			mover.succ = node;
		}
		if (node.data == item) {
			mover.find = true;
		}

		// predecessor
		if (mover.find == false) {
			mover.pred = node;
		}
		if (depth > mover.ht) {
			mover.ht = depth;
		}
		for (Node n : node.child) {
			Multimover(n, item, depth + 1, mover);
		}

	}

	private class OrderpairCT {
		Node pnode;
		boolean selfdone;
		boolean childdone;
	}

	public void preorderICT() {
		OrderpairCT p = new OrderpairCT();
		LinkedList<OrderpairCT> l = new LinkedList<>();
		p.pnode = this.root;
		l.addFirst(p);
		while (!l.isEmpty()) {
			OrderpairCT sp = l.getFirst();
			if (sp.selfdone == false) {
				System.out.println(sp.pnode.data);
				sp.selfdone = true;
			} else if (sp.childdone == false) {
				if (sp.pnode.child != null) {
					ArrayList<Node> childz = sp.pnode.child;
					
					for (int i = childz.size() - 1; i >= 0; i--) {
						OrderpairCT op = new OrderpairCT();
						op.pnode = childz.get(i);
						l.addFirst(op);
					}
				}
				sp.childdone = true;
			}
			else{
				l.removeFirst();
			}

		}
	}
}
