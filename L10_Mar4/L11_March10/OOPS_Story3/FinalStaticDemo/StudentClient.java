package L11_March10.OOPS_Story3.FinalStaticDemo;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2018
 */

public class StudentClient {

	public static void main(String[] args) throws Exception {

		Student s1 = new Student("Rohit");
		Student s2 = new Student("Aman");

		System.out.println(Student.numberOfStudents);
		Student.getNumberOfStudents();
	}

}
