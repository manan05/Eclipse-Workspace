package L23_April21.FxnGeneric;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 21-Apr-2018
 */

public class FxnGenericDemo {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4 };
		String[] arrs = { "abc", "def", "ghi" };

		Car[] cars = new Car[5];
		cars[0] = new Car("A", 100, 267);
		cars[1] = new Car("a", 500, 2000);
		cars[2] = new Car("U", 700, 100);
		cars[3] = new Car("Q", 200, 200);
		cars[4] = new Car("J", 900, 340);

		// bubbleSort(cars);
		bubbleSort(cars, new CarSpeedComparator());
		display(cars);

		bubbleSort(cars, new CarPriceComparator());
		display(cars);

		bubbleSort(cars, new CarNameComparator());
		display(cars);

	}

	public static void display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void display(String[] arr) {

		for (String val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();

	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {

				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

}
