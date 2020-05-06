package L19_Apr7;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		Node left;
		Node right;
		int data;

	}

	private Node root;
	private int size;

	public BinaryTree() {
		this.root = construct(new Scanner(System.in), root, false);
	}

	private Node construct(Scanner scanner, Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			if (ilc) {
				System.out.println("Left child" + parent.data);
			} else {
				System.out.println("Right Child" + parent.data);
			}
		}
		int val = scanner.nextInt();
		Node nn = new Node();
		this.size++;
		nn.data = val;
		System.out.println(nn.data + "Has left child ?");
		boolean lc = scanner.nextBoolean();
		if (lc == true) {
			nn.left = construct(scanner, nn, true);
		}
		System.out.println(nn.data + "Has left child ?");
		boolean rc = scanner.nextBoolean();
		if (rc == true) {
			nn.right = construct(scanner, nn, false);
		}
		return nn;

	}

	public BinaryTree(int[] pre, int[] in) {
		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);

	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (plo > phi){
			return null;
		}
		Node node = new Node();
		node.data = pre[plo];
		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i]) {
				si = i;
				break;
			}
		}
		int nel = si - ilo;
		node.right = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		node.left = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return node;

	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		String str = "";
		if (node == null) {
			return;
		}
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "->" + node.data + "<-";

		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size2() {
		int z = size2(this.root);
		return z;
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int l = 0;
		int r = 0;
		l += size2(node.left);
		r += size2(node.right);
		return l + r + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lm = max(node.left);
		int rm = max(node.right);
		return Math.max(node.data, Math.max(lm, rm));

	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean lf = find(node.left, item);
		if (lf) {
			return true;
		}
		boolean rf = find(node.right, item);
		if (rf) {
			return true;
		}

		return false;
	}

	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}
		int ls = diameter(node.left);
		int rs = diameter(node.right);
		int sp = height(node.left) + height(node.right) + 2;
		return Math.max(sp, Math.max(ls, rs));
	}

	// L20_APRIL_8

	private class Pair {
		int height = -1;
		int diameter = 0;
		boolean balance;
	}

	public int diameterPair() {
		Pair z = diameterPair(root);
		return z.diameter;
	}

	// Using this to decrease the complexity of the previous code that finds the
	// diameter;
	private Pair diameterPair(Node node) {
		// Base Case;
		if (node == null) {
			Pair base = new Pair();
			base.height = -1;
			base.diameter = 0;
			return base;
		}
		Pair left = diameterPair(node.left);
		Pair right = diameterPair(node.right);

		Pair mr = new Pair();
		mr.height = Math.max(left.height, right.height) + 1;

		int ld = left.diameter;
		int rd = right.diameter;

		// Self Participation;

		int sp = left.height + right.height + 2;
		mr.diameter = Math.max(sp, Math.max(ld, rd));

		// Have to return the new my result as a pair so that the complexity
		// becomes n instead of n^2;
		return mr;

	}

	public Boolean Balanced() {
		Pair z = Balanced(root);
		return z.balance;
	}

	private Pair Balanced(Node node) {
		if (node == null) {
			Pair n = new Pair();
			n.height = -1;
			n.balance = true;
			return n;
		}
		int bf;
		Pair left = Balanced(node.left);
		Pair right = Balanced(node.right);

		Pair mr = new Pair();
		mr.height = Math.max(left.height, right.height) + 1;

		bf = left.height - right.height;
		if (left.balance && right.balance && Math.abs(bf) <= 1) {
			mr.balance = true;
		} else
			mr.balance = false;
		return mr;
	}

	public void Preorder() {
		Preorder(root);
	}

	private void Preorder(Node node) {
		if (node == null) {
			return;
		}
		// N L R
		// Node
		System.out.println(node.data);

		// Left
		Preorder(node.left);

		// Right
		Preorder(node.right);

	}

	public void Inorder() {
		Inorder(root);
	}

	private void Inorder(Node node) {
		if (node == null) {
			return;
		}
		// LNR
		// Node

		// Left
		Inorder(node.left);
		// Node
		System.out.println(node.data);

		// Right
		Inorder(node.right);

	}

	public void Postorder() {
		Postorder(root);
	}

	private void Postorder(Node node) {
		if (node == null) {
			return;
		}
		// L R N
		// Node

		// Left;
		Postorder(node.left);
		// Right;
		Postorder(node.right);
		// Node;
		System.out.println(node.data);

	}

	private class Orderpair {
		Node pnode;
		boolean selfdone;
		boolean leftdone;
		boolean rightdone;
	}

	public void preorderI() {
		Orderpair p = new Orderpair();
		LinkedList<Orderpair> l = new LinkedList<>();
		p.pnode = this.root;
		l.addFirst(p);
		while (!l.isEmpty()) {
			Orderpair sp = l.getFirst();
			if (sp.selfdone == false) {
				System.out.println(sp.pnode.data);
				sp.selfdone = true;
			} else if (sp.leftdone == false) {
				if (sp.pnode.left != null) {
					Orderpair np = new Orderpair();
					np.pnode = sp.pnode.left;
					l.addFirst(np);
				}
				sp.leftdone = true;

			} else if (sp.rightdone == false) {
				if (sp.pnode.right != null) {
					Orderpair np = new Orderpair();
					np.pnode = sp.pnode.right;
					l.addFirst(np);
				}
				sp.rightdone = true;
			} else {
				l.removeFirst();
			}
		}

	}

}
