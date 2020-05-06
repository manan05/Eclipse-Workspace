package L2_Feb3;

public class rotate {

	public static void main(String[] args) {
		int nr = 4;
		int n = 687354;
		int c=0;
		int d= 0;
		int a = 0;
		int power = (int) Math.pow(10, nr-1);
		int lol = (int) Math.pow(10,1);
		int count = 0;
//		while (n!= 0){
//			n = n/10;
//			count = count +1  ;
		c=n%(10*power);
		n=n/(10*power);
		System.out.println(c);
		d=n%(10*lol);
		System.out.println(d);
		a=(c*100+d);
		System.out.println(a);
		
		
		

	}

}
