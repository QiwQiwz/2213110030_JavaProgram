
import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {

	private String name;
	private String dept;

	public void insert() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintStream ps = new PrintStream(new File("employee.txt"));
		String ans;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = input.nextLine();
			System.out.print("Enter department: ");
			dept = input.nextLine();
			// write all data to file
			ps.println(name + "\t" + dept);
			System.out.print("Enter data again?: ");
			ans = input.next();
			input.nextLine();
		} while (ans.equalsIgnoreCase("y"));
	}// end of method

	public void read() {
		try {
			Scanner in = new Scanner(new File("employee"));
			int i = 0;
			boolean chk = false;
			super.header();
			while (in.hasNext()) {
				name = in.next();
				dept = in.next();
				if (dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i + ") " + name);
					chk = true;
				}
			} // while
			if (chk) {
				super.header();
				System.out.print("\nEmployee in department " + super.getDept() + "is " + i + " person.");
				super.header();
			} else {
				System.out.print("\n Sorry, no department: " + super.getDept() + " in file.");
			}
			in.close();

		} catch (IOException e) {
			System.out.print("\nSorry, file not found...");
		}
	}
}
