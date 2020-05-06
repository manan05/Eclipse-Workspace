package L2_Feb3;

public class binarytodoecimal {

	public static void main(String[] args) {
	int binary = 10101001;
	int decimal = 0;
	int power = 1;
	int a=0;
	while (binary != 0){
		a = binary%10;
		decimal= decimal +(a*power);
		
		power*=2;
		binary=binary/10;	
	}
	System.out.print(decimal);


	}

}
