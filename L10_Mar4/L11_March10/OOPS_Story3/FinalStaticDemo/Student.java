package L11_March10.OOPS_Story3.FinalStaticDemo;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2018
 */

public class Student {

	String name;
	final int rollNo;
	static int numberOfStudents;

	public Student(String name) throws Exception {
		setName(name);

		numberOfStudents++;
		this.rollNo = numberOfStudents;
	}

	// non static can access static data member
	public void setName(String name) throws Exception {

		if (name == null) {
			throw new Exception("Name cannot be null");
		}

		this.name = name;
		System.out.println(Student.numberOfStudents);
	}

	// static fxn cannot access this
	// static fxn cannot access non static data members
	public static int getNumberOfStudents() {
		return numberOfStudents;

	}

}
