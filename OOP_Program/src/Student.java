
public class Student {
	// The private instance variables
	private String name;
	private String address;
	// The courses and grades for the courses are kept in 2 parallel arrays
	private String[] courses;
	private int[] grades; // valid range is [0,100]
	private int numCourses; // Number of courses taken so far
	// Maximum number of courses taken by student
	private static final int MAX_COURSES = 30;

	/* Constructor a Student instance with the given input */
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
		numCourses = 0;
	}

	// getting and set
	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return getName() + " (" + getAddress() + ")";
	}

	public void addCoursesGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	// Print all course and their grades
	public void printGrade() {
		System.out.print(name);
		for (int i = 0; i < numCourses; i++) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}

	/** Computes the average grade */
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}

		return (double) sum / numCourses;
	}

}
