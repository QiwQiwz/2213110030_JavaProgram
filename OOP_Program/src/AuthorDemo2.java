import java.util.*;
public class AuthorDemo2 {
	static Scanner scan = new Scanner(System.in);
	static int[] info =new int[4];;
	public static void main(String[] args) {
		Author author[] = new Author[4];
			for(int i =0;i<info.length;i++) {
				System.out.println("Information Author"+(i+1));
				line();
				System.out.print("Input author name   : ");
				String name = scan.nextLine();
				System.out.print("Input author email  : ");
				String email = scan.nextLine();
				line();
				author[i] = new Author(name, email);
				System.out.println();
				System.out.println(author[i].toString2());
				line();
				System.out.println();
				System.out.println();
			}
			for(int i =0;i<author.length;i++) {
				System.out.println((i+1)+"."+author[i].getName()+" ("+author[i].getEmail()+")");
			}
			

		}
	public static void line() {
		for(int i =0;i<40;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
		
	

}
