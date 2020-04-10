package L17_Mar31;

public class GTClient {

	public static void main(String[] args) {
		// 10 3 20 2 50 0 60 0 30 0 40 1 70 0
		// 10 3 20 2 50 0 60 2 100 0 110 1 140 0 30 1 200 0 40 3 70 0 80 2 120 0 130 0 90 0
		GenericTree gt = new GenericTree();
		// GenericTree gt2 = new GenericTree();
		// gt.display();
		// System.out.println(gt.size());
		// System.out.println("=============");
		// System.out.println(gt.size2());
		// System.out.println(gt.max());
		// System.out.println(gt.find(160));
		// System.out.println(gt.height());
		// gt.mirror();
		// gt.display();
		// System.out.println(gt.StructurallySimilar(gt2));

		// gt.preorder();
		// System.out.println("=============");
		// gt.postorder();
		// System.out.println("=============");
		//gt.LevelOrder();
//		gt.LevelOrderLW();
//		gt.LevelOrderZZ();
//		gt.Multisolver(10);
		gt.preorderICT();
	}

}
