package L10_Mar4.L11_March10.OOPS_Story3.FinalStaticDemo;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2018
 */

public class Student {

	// properties of the student class
	String name;
	int rollNo;
	// numberOfStudents - static because it is a property of the class not every
	// object of the class
	static int numberOfStudents;

	public void setName(String name) throws Exception {
		if (this.name == null) {
			throw new Exception("Name cannot be null.");
		}
		this.name = name;
		numberOfStudents++;
		this.rollNo = numberOfStudents;
	}

	// Parameterised constructor
	public Student(String name) throws Exception {
		setName(name);
	}

}
