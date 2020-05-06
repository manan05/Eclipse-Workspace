package L23_April21.FxnGeneric;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 21-Apr-2018
 */

public class Car implements Comparable<Car> {

	String name;
	int speed;
	int price;

	public Car(String name, int speed, int price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	@Override
	public String toString() {
		return "N:" + this.name + " S:" + this.speed + " P:" + this.price;
	}

	@Override
	public int compareTo(Car other) {
		// return this.speed - other.speed;
		return other.price - this.price;

		// return this.name.compareTo(other.name);
	}

}
