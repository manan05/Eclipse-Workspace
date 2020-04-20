package DS;

public class Test {

	public static void main(String[] args) {
//		System.out.println("TwoLoops");
//		twoLoops();
//		System.out.println("TwoVarsinSameLoop");
//		twoVarsinSameLoop();
		int[] arr = {2,-1,3,5,6,-2};
		twoVarsinSameLoop(arr);

	}
	public static void twoLoops() {
		for(int i = 0; i<5;i++) {
			for(int j = i+1;j<5;j++) {
				System.out.println(i + "+" + j);
			}
		}
	}
	
	public static void twoVarsinSameLoop(int[] arr) {
		int max = Integer.MIN_VALUE;
		int ni = 0;
		int nj = 0;
		for(int i = 0,j = i+1; i<arr.length && j<arr.length ;i++,j++) {
			System.out.println(arr[i] + "+" + arr[j]);
			int sum = arr[i] + arr[j];
			if(sum > max) {
				max= sum;
				ni = i;
				nj = j;
			}
//			System.out.println(arr[i]+arr[j]);
		}
		System.out.println(max);
		System.out.println(arr[ni] + "+" + arr[nj]);
		
	}
	

}
