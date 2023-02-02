import java.util.*;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input movie id   : ");
		String movieId = scan.nextLine();
		System.out.print("Input movie name : ");
		String movieName = scan.nextLine();
		System.out.println();
		System.out.print("Input director name   : ");
		String direcName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String direcEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char direcGender = scan.next().toLowerCase().charAt(0);
		while (direcGender!='m'&&direcGender!='f') {
			System.out.print("Input director gender, again : ");
			direcGender = scan.next().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int movieNo = scan.nextInt();
		while (movieNo < 1 || movieNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			movieNo = scan.nextInt();
		}
		Theater theater = new Theater(movieId,movieName,new Director(direcName,direcEmail,direcGender),movieNo);
		System.out.println(theater);
		
		}

	
}
