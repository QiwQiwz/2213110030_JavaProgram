
public class TestStudent {

	public static void main(String[] args) {
		// Test Constructor and toString()
		Student Motonori = new Student("Motonori Kono", "1 Happy Ave");
		System.out.println(Motonori);// toString()

		// Test Setters and Getters
		Motonori.setAddress("25 Pattanakarn");
		System.out.println(Motonori);// toString()
		System.out.println(Motonori.getName());
		System.out.println(Motonori.getAddress());

		Motonori.addCoursesGrade("INT107", 75);
		Motonori.addCoursesGrade("INT108", 79);
		Motonori.addCoursesGrade("MSC202", 89);
		Motonori.printGrade();

		System.out.printf("The average grade is %.2f%n", Motonori.getAverageGrade());

	}

}
