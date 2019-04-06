package lab7;

public class CourseTest {

	public static void main(String[] args) {
		String[] allstudents = new String [30] ;
		int numstudent;
		Course courseone = new Course("Computer Science");
		courseone.addStudent("Frank");
		courseone.addStudent("Ben");
		courseone.addStudent("Jack");
		courseone.dropStudent("Ben");
		allstudents = courseone.getStudents();
		numstudent = courseone.getNumberOfStudents();
		for(int i = 0; i < numstudent;i++) {
			System.out.println(allstudents[i]);
		}

	}
  
}
 