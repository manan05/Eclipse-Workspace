package L10_Mar4.L11_March10.OOPS_Story3.FinalStaticDemo;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 10-Mar-2018
 */

public class StudentClient {

	public static void main(String[] args) throws Exception {
		
		Student s1 = new Student("Rohit");
		Student s2 = new Student("Aman");
		
		// Accessing static data members
		System.out.println(Student.numberOfStudents);
		
		// Accessing static function
		Student.getNumberOfStudents(); 
	}

}
