package L23_April21.ClassGeneric;

import java.util.ArrayList;
import L23_April21.FxnGeneric.Car;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Apr-2018
 */

public class ClassGenericDemo {

	public static void main(String[] args) {

		GenericPair<String, Integer> gp1 = new GenericPair<>();

		GenericPair<GenericPair<String, Integer>, GenericPair<Integer, String>> gp2 = new GenericPair<>();
		System.out.println(gp2.a);
		System.out.println(gp2.b);

		gp2.a = new GenericPair<>();
		gp2.a.a = "abc";
		gp2.a.b = 12;

		gp2.b = new GenericPair<>();
		gp2.b.a = 20;
		gp2.b.b = "def";

		LinkedListGeneric<Car> ll = new LinkedListGeneric<>();
		Car[] cars = new Car[5];
		cars[0] = new Car("A", 100, 267);
		cars[1] = new Car("a", 500, 2000);
		cars[2] = new Car("U", 700, 100);
		cars[3] = new Car("Q", 200, 200);
		cars[4] = new Car("J", 900, 340);

		ll.addLast(cars[0]);
		ll.addLast(cars[1]);
		ll.addLast(cars[2]);
		ll.addLast(cars[3]);
		ll.addLast(cars[4]);

		ll.display();

		LinkedListGeneric<ArrayList<Integer>> lli = new LinkedListGeneric<>();
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		lli.addLast(list);

		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);

		// lli.addLast(list);
		lli.addLast(list1);

		lli.display();
	}

}
