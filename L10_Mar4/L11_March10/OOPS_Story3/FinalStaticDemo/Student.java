package L10_Mar4.L11_March10.OOPS_Story3.FinalStaticDemo;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2018
 */

public class Student {

	// properties of the student class
	String name;
	final int rollNo;
	// numberOfStudents - static because it is a property of the class not every
	// object of the class
	static int numberOfStudents;

	public void setName(String name) throws Exception {
		if (this.name == null) {
			throw new Exception("Name cannot be null.");
		}
		this.name = name;
		
	}

	// Parameterised constructor
	public Student(String name) throws Exception {
		setName(name);
		numberOfStudents++;
		this.rollNo = numberOfStudents;
	}
	
	// Static function
	// we cannot use this operator in static functions
	// as this is created with every instance 
	// and static is created just once
	
	// Static functions cannot access non-static data members
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	
	// Final keyword
	// final variable's values can't be changed
	// final functions cannot be overridden(cannot change body)
	// final class cannot be inherited
	
	

}
