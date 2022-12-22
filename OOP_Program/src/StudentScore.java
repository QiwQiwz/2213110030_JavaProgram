import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom: ");
		int student = scan.nextInt();		
		Student[] std = new Student[student];// defind Array Object
		for (int i = 0; i < std.length; i++) {
			System.out.println("input information of student " + (i + 1));
			std[i] = new Student();// declear array object,call medthod Student()
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again: ");
				std[i].setScore(scan.nextInt());
			} // end of while
			Line();
			System.out.println();
		} // end of for

		Line();
		/*
		 * for (int i = 0; i < std.length; i++) { if (std[i].isPass()) {
		 * System.out.println(">> " + std[i].getName() + " (" + std[i].getScore() +
		 * ")"); } }
		 */
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " get grade " + STD.findGrade());
			}
		}

	}// end of main()

	public static void Line() {
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
