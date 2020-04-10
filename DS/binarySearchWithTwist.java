package DS;

//find the leftmost index element in a sorted array
//eg A = {1,2,2,2,2,2,2}
//key = 2
//output = 1
//to be done with logN complexity
public class binarySearchWithTwist {
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,4};
		System.out.println(binarySearchxD(arr, 4));
	}

	public static int binarySearchxD(int[] array, int key) {
		int front = 0;
		int back = array.length - 1;
		int mid = 0;
		while (front < back) {
			mid = (front + back) / 2;
			if (key < array[mid]) {
				back = mid;
			} else if (key > array[mid]) {
				front = mid;
			}

			else {
				if (key == array[mid]) {
					if (mid != 0) {
						if (array[mid] == array[mid - 1]) {
							back = mid;
							continue;
						} else {
							return mid;
						}
					} else {
						return 0;
					}
				}

			}
		}
		return mid;
	}
}
