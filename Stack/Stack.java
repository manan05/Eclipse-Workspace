package Stack;

public class Stack {
	int tos;
	int[] data;
	
	//default constructor
	//which in turn calls the parameterized constructor
	public Stack() {
		this(5); //used to call the other constructor within another constructor
	}
	
	
	// Parameterized constructor
	// would create more confusion for the user
	public Stack(int cap) {
		this.tos = -1;
		this.data = new int[cap];
	}
}
