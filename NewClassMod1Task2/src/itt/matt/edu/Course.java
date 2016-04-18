package itt.matt.edu;

public class Course {

	private String name;
	private Instructor instructor;
	private String dayOfWeek;
	private String location;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	private int courseId;

@Override
public String toString() {
	return "Instructor: " + instructor +"\nDay: "+ dayOfWeek +" Location: "+
location +" Course ID: "+ courseId;
}}
