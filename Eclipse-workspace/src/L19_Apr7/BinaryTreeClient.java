package L19_Apr7;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// 10 true 20 true 40 false false true 50 false false true 30 true 60 false false false
		// 10 true 20 true 30 false false true 40 false false false
//		BinaryTree bt = new BinaryTree();
		
		int[] pre = {10,20,40,50,30,60};
		int in[] = {40,20,50,10,60,30};
		BinaryTree newBinary = new BinaryTree(pre, in);
		newBinary.display();
//		bt.display();
//		System.out.println("++++++++++++++++++++++++++++");
//		
//		System.out.println(bt.size2());
//		System.out.println("++++++++++++++++++++++++++++");
//		System.out.println(bt.max());
//		System.out.println("++++++++++++++++++++++++++++");
//		System.out.println(bt.height());
//		System.out.println("++++++++++++++++++++++++++++");
//		System.out.println(bt.find(40));
//		System.out.println("++++++++++++++++++++++++++++");
//		System.out.println(bt.diameter());
//		System.out.println("++++++++++++++++++++++++++++");
//		System.out.println(bt.diameterPair());
//		System.out.println("++++++++++++++++++++++++++++");
//		System.out.println(bt.Balanced());
//		bt.Preorder();
//		System.out.println("++++++++++++++++++++++++++++");
//		bt.Postorder();
//		System.out.println("++++++++++++++++++++++++++++");
//		bt.Inorder();
//		System.out.println("++++++++++++++++++++++++++++");
//		bt.preorderI();
		
	}

}
