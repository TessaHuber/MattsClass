package itt.matt.edu;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Institution ITT = new Institution();

		ITT.setName("ITT");
		ITT.setAddress("123 Happy Lane");

		List<Student> studentList = new ArrayList<>();
		Student student = new Student();
		student.setFirstName("Gregg");
		student.setLastName("Blacker");
		student.setId(001);
		studentList.add(student);

		Schedule sched=new Schedule();
		student.setSchedule(sched);

		List<Course> courseList= new ArrayList<>();
		Course course=new Course();
		course.setCourseId(9887);
		course.setDayOfWeek("Monday");
		course.setName("Intro to Java");
		course.setLocation("Greenfield");
		courseList.add(course);

		Instructor instructor=new Instructor();
		instructor.setDepartment("IT");

		try {
			instructor.setFirstName("Matt");
			instructor.setLastName(null);
		} catch (NameException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

		instructor.setInstructorID(15589);
		course.setInstructor(instructor);

		System.out.println(student);
		System.out.println(instructor);
		System.out.println(courseList);




	}

}
